public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmountInRubles = 1_000_000; // сумма кредита
        double interestRateInPercents = 9.99; // процентная ставка
        int loanTermInYears = 1; // срок кредита 1 год

        int monthlyLoanPayment = service
                .calculateMonthlyPayment(
                        loanAmountInRubles,
                        interestRateInPercents,
                        loanTermInYears
                ); // Должно получиться 87911
        System.out.println(monthlyLoanPayment);

        loanTermInYears = 2; // срок кредита 2 года
        monthlyLoanPayment = service
                .calculateMonthlyPayment(
                        loanAmountInRubles,
                        interestRateInPercents,
                        loanTermInYears
                ); // Должно получиться 87911
        System.out.println(monthlyLoanPayment);

        loanTermInYears = 3; // срок кредита 3 года
        monthlyLoanPayment = service
                .calculateMonthlyPayment(
                        loanAmountInRubles,
                        interestRateInPercents,
                        loanTermInYears
                ); // Должно получиться 87911
        System.out.println(monthlyLoanPayment);
    }
}