import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
           
        int result = number * number;
        
        System.out.printf("The square of %d is %d\n", number, result);
    }
}
