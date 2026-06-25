-- -- ==================================
-- -- Exercise 1 : Control Structures
-- -- Scenario 3
-- -- Loan reminders
-- -- ==================================

-- DECLARE

-- CURSOR c_loan IS

-- SELECT
-- C.CustomerID,
-- C.Name,
-- L.EndDate

-- FROM Customers C
-- JOIN Loans L

-- ON C.CustomerID=L.CustomerID

-- WHERE L.EndDate
-- BETWEEN
-- SYSDATE
-- AND
-- SYSDATE+30;

-- v_id Customers.CustomerID%TYPE;

-- v_name Customers.Name%TYPE;

-- v_date DATE;

-- BEGIN

-- OPEN c_loan;

-- LOOP

-- FETCH c_loan
-- INTO
-- v_id,
-- v_name,
-- v_date;

-- EXIT WHEN c_loan%NOTFOUND;

-- DBMS_OUTPUT.PUT_LINE(
-- 'Reminder sent to '
-- ||
-- v_name
-- ||
-- ' Loan Due Date: '
-- ||
-- TO_CHAR(
-- v_date,
-- 'DD-MON-YYYY'
-- )
-- );

-- END LOOP;

-- CLOSE c_loan;

-- END;
-- /

DECLARE

CURSOR c_loan IS

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

v_id NUMBER;

v_name VARCHAR2(100);

v_enddate DATE;

BEGIN

OPEN c_loan;

LOOP

FETCH c_loan
INTO
v_id,
v_name,
v_enddate;

EXIT WHEN c_loan%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
'Reminder sent to '
||
v_name
||
' Loan Due Date: '
||
TO_CHAR(
v_enddate,
'DD-MM-YYYY'
)
);

END LOOP;

CLOSE c_loan;

END;
/