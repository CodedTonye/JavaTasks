import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the side length of the hexagon: ");
	double s = input.nextDouble();

	double area = (3 * Math.sqrt(3)) * Math.pow(s, 2) / 2;

	System.out.printf("The area of the hexagon is: %.2f%n", area);
	}
}