import java.security.SecureRandom;

public class RandomCoordinateDisplay {
    
    public static void main(String[] args) {

	SecureRandom randomNum = new SecureRandom();

	double width = 50;
	double height = 150;

	double x = (randomNum.nextDouble() * width) - (width / 2);

	double y = (randomNum.nextDouble() * height) - (height / 2);

	System.out.printf("The random coordinate point is: (%.2f, %.2f)%n", x, y);
  }
}