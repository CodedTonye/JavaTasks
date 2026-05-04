//Print array horizontally
import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
        
        int [] scores = new int [10];
        
        for (int count = 0; count <= 9; count++) {
            System.out.print("Enter 10 integers: "); 
            int number = inputCollector.nextInt();  
            
            scores [count] = number; 
        }
        
        for (int count = 0; count <= 9; count++) { 
            
            System.out.println(scores [count] + " "); 
        }
        
       
    }
}

