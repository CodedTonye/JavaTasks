import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int count = 1;
        int sum = 0;
        double average = 0;
        
        while (count <= 3) {
        
            System.out.print("Enter number: ");
            int number = inputCollector.nextInt();
            sum += number;
            count++;
       
            average = sum / 3;
            
        }
        System.out.printf("The average of three numbers is %.2f%n", average);
    }
}
