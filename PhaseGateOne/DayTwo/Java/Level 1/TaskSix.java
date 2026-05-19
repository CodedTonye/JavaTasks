import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter Length of a Rectangle: ");
        double length = inputCollector.nextDouble();
        
        System.out.print("Enter Width of a Rectangle: ");
        double width = inputCollector.nextDouble();
        
        
        double area = length * width;
        
        System.out.printf("The area of the reactangle is %.2f\n", area);
   
    }
}
