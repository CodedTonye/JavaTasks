import java.util.Scanner;

public class SumDigitsMethod {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        long n = inputCollector.nextLong();
        
        int result = SumDigitsMethod.sumDigits(n);
        System.out.println("The sum of the digits is: " + result);
    }

    public static int sumDigits(long n) {
        int sum = 0; 
        while (n > 0) {
            sum += n % 10;
            n = n / 10;    
        }
        return sum;
    }
}

