import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter Second number: ");
        int secondNumber = inputCollector.nextInt();
        
        int product = firstNumber * secondNumber;
        
        System.out.printf("The product of two numbers is %d%n", product);
   
    }
}
