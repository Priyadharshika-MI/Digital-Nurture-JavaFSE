-- ==================================
-- Exercise 2 : Error Handling
-- Scenario 2
-- Update Employee Salary
-- ==================================

CREATE OR REPLACE PROCEDURE
UpdateSalary
(
p_empid NUMBER,
p_percent NUMBER
)

IS

v_count NUMBER;

BEGIN

SELECT COUNT(*)

INTO v_count

FROM Employees

WHERE EmployeeID=p_empid;


IF v_count=0 THEN

RAISE_APPLICATION_ERROR(
-20002,
'Employee Not Found'
);

END IF;


UPDATE Employees

SET Salary=
Salary+
(
Salary*p_percent/100
)

WHERE EmployeeID=p_empid;

COMMIT;

DBMS_OUTPUT.PUT_LINE(
'Salary Updated'
);

EXCEPTION

WHEN OTHERS THEN

ROLLBACK;

DBMS_OUTPUT.PUT_LINE(
SQLERRM
);

END;
/