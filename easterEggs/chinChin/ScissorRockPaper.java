import java.util.Scanner;
import java.security.SecureRandom;

public class ScissorRockPaper {
    
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	SecureRandom randomChoice = new SecureRandom();

	System.out.print("Enter scissors (0), rock (1), paper (2): ");
	int userInput = input.nextInt();

	int computerChoice = randomChoice.nextInt(3);

	String [] choices = {"scissor", "rock", "paper"};

	    System.out.printf("The computer is %s. You are %s.%n", choices[computerChoice], choices[userInput]);

	if (userInput == computerChoice) {
	    System.out.println("It is a Draw.");
	} else if ((userInput == 0 && computerChoice == 2) ||
		   (userInput == 1 && computerChoice == 0) ||
		   (userInput == 2 && computerChoice == 1)) {
	    System.out.println("You Won."); 
	} else {
	    System.out.println("You Lost."); 
	}
  }
}