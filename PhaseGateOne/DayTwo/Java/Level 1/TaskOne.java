import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = inputCollector.nextLine();
        
        System.out.printf("Welcome to Nigeria %s", name);
   
    }
}
