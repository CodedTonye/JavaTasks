import java.util.Scanner;

public class SumOfFirstNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int userInput = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= userInput; i++) {

            sum += i;
            
        }
            System.out.println("The sum of first N number is: " + sum);
    } 
}
