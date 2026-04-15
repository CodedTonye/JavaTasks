import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
    
        
            int score = 0;
            
            int sum = 0;
            
        while (score <= 10) {
            
            System.out.print("Enter ten numbers: ");
            score = inputCollector.nextInt();
            
             score++;
             sum += score;
            
            }
     
           
            System.out.println(sum);
            
        }
        
    } 

