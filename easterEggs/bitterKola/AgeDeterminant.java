import java.util.Scanner;

public class AgeDeterminant {
  
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your Birth Year: ");
	int birthYear = input.nextInt();

	System.out.print("Enter Current Year: ");
	int currentYear = input.nextInt();

	int eligibility = currentYear - birthYear;

	if (eligibility > 65) {
	    System.out.printf("You are %d years old. You are eligible for a senior citizen discount.", eligibility);
	} else {
	    System.out.printf("You are %d years old. You are not eligible for a senior citizen discount.", eligibility);
	}
  }
}