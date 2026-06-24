-- ==================================
-- Exercise 2 : Error Handling
-- Scenario 3
-- Add New Customer
-- ==================================

CREATE OR REPLACE PROCEDURE AddNewCustomer
(
p_id NUMBER,
p_name VARCHAR2,
p_dob DATE,
p_balance NUMBER
)

IS

BEGIN

INSERT INTO Customers
(
CustomerID,
Name,
DOB,
Balance,
LastModified
)

VALUES
(
p_id,
p_name,
p_dob,
p_balance,
SYSDATE
);

COMMIT;

DBMS_OUTPUT.PUT_LINE(
'Customer Added Successfully'
);

EXCEPTION

WHEN DUP_VAL_ON_INDEX THEN

ROLLBACK;

DBMS_OUTPUT.PUT_LINE(
'Error : Customer ID already exists'
);

WHEN OTHERS THEN

ROLLBACK;

DBMS_OUTPUT.PUT_LINE(
'Unexpected Error'
);

END;
/