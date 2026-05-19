import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();
        
        int sum = 0;
        
        while (number != 0) {
        
        System.out.print("Enter an integer: ");
            number = inputCollector.nextInt();
        
        
            sum += number;
            
        
        }
        System.out.printf("The sum of numbers is %d", sum);
    }
}
