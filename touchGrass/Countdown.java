import java.util.Scanner;
public class Countdown {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter starting number: ");
        int number = inputCollector.nextInt();
        
        for (int counter = number; counter >= 1; counter--) { 
            System.out.println(counter);
        }
        System.out.println("Blast off!");
    }
}
