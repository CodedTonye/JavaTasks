import java.util.Scanner;

public class PizzaWahala {
    
    public static void calculateOrder(int people, String pizzaType) {
        int slicesPerBox = 0;
        int pricePerBox = 0;
        
        switch (pizzaType.toLowerCase()) {
            case "sapa size":
                slicesPerBox = 4;
                pricePerBox = 2500;
                break;
            case "small money":
                slicesPerBox = 6;
                pricePerBox = 2900;
                break;
            case "big boys":
                slicesPerBox = 8;
                pricePerBox = 4000;
                break;
            case "odogwu":
                slicesPerBox = 12;
                pricePerBox = 5200;
                break; 
            default:
                System.out.println("Invalid Pizza type");
                return;
               
        }
        
        int boxes = (people + slicesPerBox - 1) / slicesPerBox;
        
        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;
        
        System.out.println("Number of boxes of Pizza to buy = " + boxes + " boxes.");
        System.out.println("Number of left over slices after serving = " + leftover + " slices.");
        System.out.println("Price = " + totalPrice); 
    }
    
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter number of people: ");
        int people = inputCollector.nextInt();
        inputCollector.nextLine();
        
        System.out.print("Enter Pizza type (Sapa size, Small money, Big boys, Odogwu): ");
        String pizzaType = inputCollector.nextLine();
        
        calculateOrder(people, pizzaType);
    }
}





















