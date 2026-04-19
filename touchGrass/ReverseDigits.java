import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        
        int reversed = 0;
        
        while (number > 0){
        
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
         
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
