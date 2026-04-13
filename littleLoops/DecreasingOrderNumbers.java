import java.util.Scanner;

public class DecreasingOrderNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int userInput = input.nextInt();

        for (int i = userInput; i >= 1; i--) {

             System.out.println(i);
        }

    } 
}
