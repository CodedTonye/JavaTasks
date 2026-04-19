import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int max = 0;
        int count = 0;
        
        System.out.print("Enter integers (0 to stop): ");
        
        while (true) {
            int number = inputCollector.nextInt();
            
            System.out.print("Enter integers (0 to stop): ");
            
            if (number == 0) break;
            
            if (number > max) {
                max = number;
                count = 1;
            }
            else if (number == max) {
                count++;
            }
        
        }
        
        if (max != 0) {
            System.out.println("The largest number is " + max);
            System.out.println("The largest number occurence count is  " + count);
        }
        else {
            System.out.println("No numbers were entered.");
        }
    }
}
