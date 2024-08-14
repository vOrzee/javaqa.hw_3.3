public class CreditPaymentService {
    public int calculateMonthlyPayment(int loanAmountInRubles, double interestRateInPercents, int loanTermInYears) {
        double monthlyInterestRate = interestRateInPercents / 12 / 100;
        double monthlyPayment = (loanAmountInRubles * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermInYears * 12));
        return (int) Math.round(monthlyPayment);
    }
}
