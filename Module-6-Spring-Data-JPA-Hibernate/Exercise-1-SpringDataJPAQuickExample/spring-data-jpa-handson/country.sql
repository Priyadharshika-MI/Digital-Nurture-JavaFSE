-- Create the database schema if it does not exist
CREATE DATABASE IF NOT EXISTS ormlearn;
USE ormlearn;

-- Create the country table
CREATE TABLE IF NOT EXISTS country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50) NOT NULL
);

-- Insert initial sample countries
INSERT INTO country (co_code, co_name) VALUES ('IN', 'India') ON DUPLICATE KEY UPDATE co_name='India';
INSERT INTO country (co_code, co_name) VALUES ('US', 'United States') ON DUPLICATE KEY UPDATE co_name='United States';
INSERT INTO country (co_code, co_name) VALUES ('JP', 'Japan') ON DUPLICATE KEY UPDATE co_name='Japan';
INSERT INTO country (co_code, co_name) VALUES ('CN', 'China') ON DUPLICATE KEY UPDATE co_name='China';
INSERT INTO country (co_code, co_name) VALUES ('GB', 'United Kingdom') ON DUPLICATE KEY UPDATE co_name='United Kingdom';
