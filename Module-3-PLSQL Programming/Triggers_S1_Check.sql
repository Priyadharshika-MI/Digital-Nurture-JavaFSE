UPDATE Customers
SET Balance = 2000
WHERE CustomerID = 1;

SELECT
CustomerID,
Name,
Balance,
LastModified
FROM Customers
WHERE CustomerID = 1;