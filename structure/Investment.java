import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter amount: ");
        double amount = inputCollector.nextDouble();
        
        System.out.print("Enter annual interest rate: ");
        double rate = inputCollector.nextDouble() / 1200;

        System.out.println("Years  Future Value");
        for (int counter = 1; counter <= 30; counter++) {
            System.out.printf("%-7d%.2f\n", counter, futureInvestmentValue(amount, rate, counter));
        }
    }

    public static double futureInvestmentValue(double amount, double monthlyRate, int years) {
        return amount * Math.pow(1 + monthlyRate, years * 12);
    }
}
