import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter Second number: ");
        int secondNumber = inputCollector.nextInt();
        
        int sum = firstNumber + secondNumber;
        
        System.out.printf("The sum of two numbers is %d%n", sum);
   
    }
}
