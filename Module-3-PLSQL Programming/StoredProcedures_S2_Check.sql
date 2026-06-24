BEGIN

UpdateEmployeeBonus
(
'IT',
10
);

END;
/

SELECT
EmployeeID,
Name,
Department,
Salary
FROM Employees;