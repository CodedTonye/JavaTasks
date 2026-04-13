public class TwoRectangleEdges {
    
    public static void main(String[] args) {

	double edge1 = 20;
	double edge2 = 20;

	if (edge1 != edge2) {
	    double perimeter = 2 * (edge1 + edge2);
	    System.out.println("The perimeter is: " + perimeter);
	} else {
	    System.out.println("The input is invalid. Both edges must have different lengths.");
	}
  }
}