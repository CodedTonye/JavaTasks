import java.util.Scanner;
public class PowersOfTwo {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter the value of n: ");
        int number = inputCollector.nextInt();
        
        for (int counter = 1; counter <= number; counter++) {
        
        
            int result = (int) Math.pow(2, counter);  
            System.out.println("2 raised to power " + counter + " is: " + result);
        }
        
    }
}
