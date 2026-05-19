import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int count = 1;
        int sum = 0;
        
        while (count <= 5) {
        
        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();
        count++;
        
            sum += number;
        
        }
        System.out.printf("The sum of 5 numbers is %d", sum);
    }
}
