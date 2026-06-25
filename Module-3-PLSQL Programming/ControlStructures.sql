DECLARE

CURSOR c_customer IS
SELECT
CustomerID,
TRUNC(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
FROM Customers;

v_id NUMBER;
v_age NUMBER;

BEGIN

OPEN c_customer;

LOOP

FETCH c_customer
INTO v_id,v_age;

EXIT WHEN c_customer%NOTFOUND;

IF v_age > 60 THEN

UPDATE Loans
SET InterestRate =
InterestRate - 1
WHERE CustomerID = v_id;

DBMS_OUTPUT.PUT_LINE(
'Discount applied to customer '
|| v_id
);

END IF;

END LOOP;

CLOSE c_customer;

COMMIT;

END;
/