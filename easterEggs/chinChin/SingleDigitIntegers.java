import java.security.SecureRandom;

public class SingleDigitIntegers {
    
    public static void main(String[] args) {

	SecureRandom random = new SecureRandom();

	int num1 = random.nextInt(10);
	int num2 = random.nextInt(10);

	int positiveDifference;

	if (num1 > num2) {
	    positiveDifference = num1 - num2; 
	} else {
	    positiveDifference = num2 - num1;
	}

	System.out.println("First Number: " + num1);
	System.out.println("Second Number: " + num2);
	System.out.println("Positive Difference: " + positiveDifference);
  }
}