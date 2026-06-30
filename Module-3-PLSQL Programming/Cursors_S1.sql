DECLARE

CURSOR GenerateMonthlyStatements IS

SELECT
T.TransactionID,
A.CustomerID,
T.TransactionDate,
T.Amount,
T.TransactionType

FROM Transactions T
JOIN Accounts A

ON T.AccountID = A.AccountID

WHERE EXTRACT(MONTH FROM T.TransactionDate)
=
EXTRACT(MONTH FROM SYSDATE)

AND EXTRACT(YEAR FROM T.TransactionDate)
=
EXTRACT(YEAR FROM SYSDATE);

v_transactionid Transactions.TransactionID%TYPE;
v_customerid Accounts.CustomerID%TYPE;
v_date Transactions.TransactionDate%TYPE;
v_amount Transactions.Amount%TYPE;
v_type Transactions.TransactionType%TYPE;

BEGIN

OPEN GenerateMonthlyStatements;

LOOP

FETCH GenerateMonthlyStatements
INTO
v_transactionid,
v_customerid,
v_date,
v_amount,
v_type;

EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
'Customer: ' || v_customerid ||
' Transaction: ' || v_transactionid ||
' Amount: ' || v_amount ||
' Type: ' || v_type
);

END LOOP;

CLOSE GenerateMonthlyStatements;

END;
/