BEGIN

ProcessMonthlyInterest;

END;
/

SELECT
AccountID,
CustomerID,
AccountType,
Balance
FROM Accounts;