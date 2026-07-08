package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        LOGGER.info("Starting OrmLearnApplication...");
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        // Seed data if empty (helps run out-of-the-box on clean db)
        seedDatabaseIfEmpty();

        // Perform required verification tests
        LOGGER.info("---------------------------------------");
        LOGGER.info("Executing Hands-on Test Operations:");
        LOGGER.info("---------------------------------------");

        testGetAllCountries();
        
        testGetCountryByCode("IN");
        testGetCountryByCode("ZZ"); // Testing invalid code for exception handling
        
        testAddCountry();
        
        testUpdateCountry("US", "United States of America");
        
        testDeleteCountry("CN");

        LOGGER.info("---------------------------------------");
        LOGGER.info("All Hands-on Test Operations Completed.");
        LOGGER.info("---------------------------------------");
    }

    private static void seedDatabaseIfEmpty() {
        List<Country> countries = countryService.getAllCountries();
        if (countries.isEmpty()) {
            LOGGER.info("Database is empty. Seeding default countries...");
            countryService.addCountry(new Country("IN", "India"));
            countryService.addCountry(new Country("US", "United States"));
            countryService.addCountry(new Country("JP", "Japan"));
            countryService.addCountry(new Country("CN", "China"));
            countryService.addCountry(new Country("GB", "United Kingdom"));
            LOGGER.info("Database seeded successfully.");
        } else {
            LOGGER.info("Database already contains data. Skipping seeding.");
        }
    }

    private static void testGetAllCountries() {
        LOGGER.info("START - testGetAllCountries");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.info("All Countries Count: {}", countries.size());
        for (Country country : countries) {
            LOGGER.info("Country -> Code: {}, Name: {}", country.getCode(), country.getName());
        }
        LOGGER.info("END - testGetAllCountries");
    }

    private static void testGetCountryByCode(String code) {
        LOGGER.info("START - testGetCountryByCode for '{}'", code);
        try {
            Country country = countryService.findCountryByCode(code);
            LOGGER.info("Retrieved Country: Code = {}, Name = {}", country.getCode(), country.getName());
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country Lookup Failed: {}", e.getMessage());
        }
        LOGGER.info("END - testGetCountryByCode for '{}'", code);
    }

    private static void testAddCountry() {
        LOGGER.info("START - testAddCountry");
        String code = "FR";
        String name = "France";
        try {
            // Verify if already exists from a previous run
            try {
                Country existing = countryService.findCountryByCode(code);
                LOGGER.info("Country '{}' already exists. Deleting it to re-test insert.", code);
                countryService.deleteCountry(code);
            } catch (CountryNotFoundException e) {
                // Good, doesn't exist yet
            }

            Country newCountry = new Country(code, name);
            countryService.addCountry(newCountry);
            LOGGER.info("Successfully added country: Code = {}, Name = {}", code, name);

            // Fetch to confirm insertion
            Country fetched = countryService.findCountryByCode(code);
            LOGGER.info("Fetched added country: Code = {}, Name = {}", fetched.getCode(), fetched.getName());
        } catch (Exception e) {
            LOGGER.error("Error in testAddCountry: {}", e.getMessage(), e);
        }
        LOGGER.info("END - testAddCountry");
    }

    private static void testUpdateCountry(String code, String newName) {
        LOGGER.info("START - testUpdateCountry for '{}'", code);
        try {
            LOGGER.info("Updating country '{}' name to '{}'...", code, newName);
            countryService.updateCountry(code, newName);
            
            // Fetch to confirm update
            Country updated = countryService.findCountryByCode(code);
            LOGGER.info("Fetched updated country: Code = {}, Name = {}", updated.getCode(), updated.getName());
        } catch (CountryNotFoundException e) {
            LOGGER.error("Failed to update country: {}", e.getMessage());
        }
        LOGGER.info("END - testUpdateCountry for '{}'", code);
    }

    private static void testDeleteCountry(String code) {
        LOGGER.info("START - testDeleteCountry for '{}'", code);
        try {
            LOGGER.info("Deleting country '{}'...", code);
            countryService.deleteCountry(code);
            
            // Confirm deletion by searching for it again
            try {
                countryService.findCountryByCode(code);
                LOGGER.warn("Warning: Country '{}' was still found after deletion!", code);
            } catch (CountryNotFoundException e) {
                LOGGER.info("Confirmation: Country '{}' was successfully deleted (not found in database).", code);
            }
        } catch (CountryNotFoundException e) {
            LOGGER.error("Failed to delete country: {}", e.getMessage());
        }
        LOGGER.info("END - testDeleteCountry for '{}'", code);
    }
}
