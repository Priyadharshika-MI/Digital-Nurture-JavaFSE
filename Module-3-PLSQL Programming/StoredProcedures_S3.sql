-- ==================================
-- Exercise 3 : Stored Procedures
-- Scenario 3
-- Transfer Funds
-- ==================================

CREATE OR REPLACE PROCEDURE TransferFunds
(
p_from NUMBER,
p_to NUMBER,
p_amount NUMBER
)

IS

v_balance NUMBER;

BEGIN

SELECT Balance

INTO v_balance

FROM Accounts

WHERE AccountID=p_from;


IF v_balance<p_amount THEN

RAISE_APPLICATION_ERROR(
-20003,
'Insufficient Balance'
);

END IF;


UPDATE Accounts

SET Balance=
Balance-p_amount

WHERE AccountID=p_from;


UPDATE Accounts

SET Balance=
Balance+p_amount

WHERE AccountID=p_to;

COMMIT;

DBMS_OUTPUT.PUT_LINE(
'Funds Transferred Successfully'
);

EXCEPTION

WHEN OTHERS THEN

ROLLBACK;

DBMS_OUTPUT.PUT_LINE(
SQLERRM
);

END;
/