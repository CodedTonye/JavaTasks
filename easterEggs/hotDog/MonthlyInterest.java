public class MonthlyInterest {

    public static void main(String[] args) {

	double balance = 100000;

	double annualInterestRate = 30;

	double interest = balance * (annualInterestRate / 1200);

	System.out.printf("The Interest rate for next month is %.2f%n", annualInterestRate, interest);
	}
}