import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();
        
        int sum = 0;
        
        for (int count = 1; count <= number; count++) {
            
            sum += count;
            
        }
        System.out.printf("The sum of %d is %d", number, sum);
    }
}
