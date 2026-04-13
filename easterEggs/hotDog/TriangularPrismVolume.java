public class TriangularPrismVolume {

    public static void main(String[] args) {

	double side = 15;

	double length = 20;

	double area = (Math.sqrt(3) / 4) * side * side;

	double volume = area * length;
	
	System.out.println("The Volume of the Triangular Prism is " + volume);	
	}
}