import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();
        
        int factorial = 1;
        
        for (int count = 1; count <= number; count++) {
            
            factorial *= count;
            
        }
        System.out.printf("The factorial of %d is %d", number, factorial);
    }
}
