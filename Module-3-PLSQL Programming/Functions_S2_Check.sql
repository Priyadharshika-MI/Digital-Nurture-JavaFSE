SELECT
    LoanID,
    LoanAmount,
    InterestRate,
    CalculateMonthlyInstallment(
        LoanAmount,
        InterestRate,
        5
    ) AS MonthlyInstallment
FROM Loans;