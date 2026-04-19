import java.util.Scanner;
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
    
    Scanner inputCollector = new Scanner(System.in);
    
    double sum = 0;
    int count = 0;
    
    System.out.print("Enter positive numbers (negative to stop): ");
    
    while (true) {
        double number = inputCollector.nextInt();
        
//        System.out.print("Enter positive numbers (negative to stop): ");
    
       
        if (number < 0) {   
            break;
        }
        
        System.out.print("Enter positive numbers (negative to stop): ");
        
        sum += number;
        count++;
    }
    
    if (count > 0) {
        double average = sum / count;
        System.out.println("The average is: " + average);
        
        }
    }
}
