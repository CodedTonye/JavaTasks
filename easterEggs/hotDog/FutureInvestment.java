public class FutureInvestment {

    public static void main(String[] args) {

	double investmentAmount =500000;

	double annualInterestRate = 0.5;

	int years = 5;

	double monthlyInterestRate = annualInterestRate /12;

	double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	System.out.printf("The Future Value is %.2f%n", futureInvestmentValue);
	}
}