ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);


UPDATE Customers
SET Balance=15000
WHERE CustomerID=1;


DECLARE

CURSOR c_customer IS
SELECT
CustomerID,
Balance
FROM Customers;

v_id NUMBER;
v_balance NUMBER;

BEGIN

OPEN c_customer;

LOOP

FETCH c_customer
INTO
v_id,
v_balance;

EXIT WHEN c_customer%NOTFOUND;

IF v_balance>10000 THEN

UPDATE Customers
SET IsVIP='TRUE'
WHERE CustomerID=v_id;

DBMS_OUTPUT.PUT_LINE(
'Customer '
||v_id||
' promoted to VIP'
);

END IF;

END LOOP;

CLOSE c_customer;

COMMIT;

END;
/