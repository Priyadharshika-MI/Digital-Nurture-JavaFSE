CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT
ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog
    (
        AuditID,
        TransactionID,
        ActionDate
    )
    VALUES
    (
        1,
        :NEW.TransactionID,
        SYSDATE
    );
END;
/