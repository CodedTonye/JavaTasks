import java.util.Scanner;

public class PrintUserNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int userInput = input.nextInt();

        for (int i = 1; i <= userInput; i++) {
            System.out.println(i + " ");
        }
        
    } 
}
