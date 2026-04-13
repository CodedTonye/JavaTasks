import java.security.SecureRandom;

public class RainbowColourDisplay {
    
    public static void main(String[] args) {

	SecureRandom randomNumbers = new SecureRandom();

	int randomNum = 1 + randomNumbers.nextInt(7);

	switch (randomNum) {
            case 1 -> System.out.println("Violet");
	    case 2 -> System.out.println("Indigo");
	    case 3 -> System.out.println("Blue");
	    case 4 -> System.out.println("Green");
	    case 5 -> System.out.println("Yellow");
	    case 6 -> System.out.println("Orange");
	    case 7 -> System.out.println("Red");
    }
	System.out.println(randomNum);
  }
}