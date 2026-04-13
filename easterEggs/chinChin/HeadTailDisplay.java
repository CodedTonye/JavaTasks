import java.util.Scanner;
import java.security.SecureRandom;

public class HeadTailDisplay {
    
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	SecureRandom randomNumbers = new SecureRandom();

	System.out.print("Enter 0 for Head, 1 for Tail: ");
	int userInput = input.nextInt(); 

	int computer = randomNumbers.nextInt(2);

	String [] choices = {"Head", "Tail"};

	System.out.printf("The computer is %s. You are %s.%n", choices[computer], choices[userInput]);

	if (userInput == computer) {
	    System.out.println("Your guess is correct.");

    	}else {
	    System.out.println("You are wrong."); 
	}
  }
}
