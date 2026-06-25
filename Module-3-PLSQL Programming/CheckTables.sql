--ControlStructures.sql
-- SELECT
-- LoanID,
-- CustomerID,
-- InterestRate
-- FROM Loans;

UPDATE Loans
SET EndDate = SYSDATE + 20
WHERE CustomerID = 1;

COMMIT;

SELECT
CustomerID,
Name,
Balance,
IsVIP
FROM Customers;

SELECT
LoanID,
CustomerID,
InterestRate,
EndDate
FROM Loans;

SELECT
C.CustomerID,
C.Name,
L.EndDate

FROM Customers C

JOIN Loans L

ON C.CustomerID=L.CustomerID

WHERE L.EndDate
BETWEEN
SYSDATE
AND
SYSDATE+30;

SELECT
AccountID,
CustomerID,
Balance
FROM Accounts;

SELECT
EmployeeID,
Name,
Salary
FROM Employees;