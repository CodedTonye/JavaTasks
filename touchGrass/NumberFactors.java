import java.util.Scanner;
public class NumberFactors {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        System.out.print("The factors of " + number + " are: ");
        
        for (int counter = 1; counter <= number; counter++) { 
        
            if (number % counter == 0) {
                System.out.println(counter + " ");
            }
        }
    }
}
