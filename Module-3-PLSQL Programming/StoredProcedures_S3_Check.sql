BEGIN

TransferFunds
(
2,
1,
500
);

END;
/

SELECT
AccountID,
CustomerID,
Balance
FROM Accounts;