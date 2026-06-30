SELECT
    CustomerID,
    Name,
    CalculateAge(DOB) AS AGE
FROM Customers;