import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        double radius = inputCollector.nextDouble();
        
        double pi = 22 / 7;
        
        double circumference = 2 * pi * radius;
        
        System.out.printf("The circumference of a circle is %.2f\n", circumference);
        System.out.print(pi);
    }
}
