import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter Temperature in Celsius: ");
        int celsius = inputCollector.nextInt();
        
        
        int fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("The Temperature in Fahrenheit is %d degree\n", fahrenheit);
   
    }
}
