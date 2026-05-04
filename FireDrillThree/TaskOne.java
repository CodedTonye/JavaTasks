//Collect 10 scores and put them in an array
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
        
        int [] scores = new int [10];
        
        for (int count = 0; count <= 9; count++) {
            System.out.print("Enter 10 integers: "); 
            int number = inputCollector.nextInt();  
            
            scores [count] = number; 
        }
        
        for (int count = 0; count <= 9; count++) { 
            
            System.out.print(scores [count] + " "); 
        }
        
       
    }
}

