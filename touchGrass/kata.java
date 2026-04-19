import java.util.Scanner;
public class kata {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter two numbers to find the max: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();
        System.out.println("Maximum: " + getMax(numberOne, numberTwo));
        
        System.out.print("\nEnter an integer to check if it is even: ");
        int checkEven = inputCollector.nextInt();
        System.out.println("Is even? " + isEven(checkEven));
        
        System.out.print("\nEnter an integer to check if it is a prime number: ");
        int checkPrime = inputCollector.nextInt();
        System.out.println("Is prime? " + isPrimeNumber(checkPrime));
        
        
        System.out.print("\nEnter an integer to find its square: ");
        int square = inputCollector.nextInt();
        System.out.println("Square: " + squareOf(square));  
        
    }
    
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static boolean isPrimeNumber(int number) {
        if (number < 2) return false;
            for (int counter = 2; counter < number; counter++) {
                if (number % counter == 0) return false;
            }
            return true;
    }
    
    public static long squareOf (int number) {
        return (long) number * number;
    }
}
