DECLARE

    v_result BOOLEAN;

BEGIN

    v_result :=
    HasSufficientBalance
    (
        1,
        500
    );

    IF v_result THEN
        DBMS_OUTPUT.PUT_LINE(
            'Sufficient Balance'
        );
    ELSE
        DBMS_OUTPUT.PUT_LINE(
            'Insufficient Balance'
        );
    END IF;

END;
/