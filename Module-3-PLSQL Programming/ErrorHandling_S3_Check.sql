BEGIN

AddNewCustomer
(
1,
'David',
TO_DATE(
'1995-06-10',
'YYYY-MM-DD'
),
3000
);

END;
/

SELECT
CustomerID,
Name,
Balance
FROM Customers;