BEGIN

    CustomerManagement.AddCustomer
    (
        10,
        'Rahul',
        TO_DATE('2000-05-10','YYYY-MM-DD'),
        5000
    );

END;
/

SELECT
CustomerID,
Name,
Balance
FROM Customers
WHERE CustomerID = 10;
