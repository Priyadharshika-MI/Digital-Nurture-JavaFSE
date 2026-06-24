-- -- -- -- SELECT table_name
-- -- -- -- FROM user_tables;
-- -- -- SELECT table_name
-- -- -- FROM user_tables
-- -- -- WHERE table_name IN
-- -- -- (
-- -- -- 'CUSTOMERS',
-- -- -- 'ACCOUNTS',
-- -- -- 'TRANSACTIONS',
-- -- -- 'LOANS',
-- -- -- 'EMPLOYEES'
-- -- -- );
-- -- SELECT
-- -- CustomerID,
-- -- Name,
-- -- TRUNC(
-- -- MONTHS_BETWEEN(
-- -- SYSDATE,
-- -- DOB
-- -- )/12
-- -- ) AS AGE
-- -- FROM Customers;
-- -- SELECT *
-- -- FROM Loans;
-- SELECT
-- CustomerID,
-- Name,
-- TRUNC(
-- MONTHS_BETWEEN(
-- SYSDATE,
-- DOB
-- )/12
-- ) AS AGE
-- FROM Customers;
SELECT
LoanID,
CustomerID,
InterestRate
FROM Loans;