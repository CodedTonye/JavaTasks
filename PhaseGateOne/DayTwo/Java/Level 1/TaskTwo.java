import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("What is your age? ");
        int age = inputCollector.nextInt();
        
        int newAge = age + 5;
        
        System.out.printf("You will be %d years old in 5 years.\n", newAge);
   
    }
}
