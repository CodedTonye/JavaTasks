import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        Random randomNumbers = new Random();
        
        int random = randomNumbers.nextInt(100) + 1;; 
        
        int maxTries = 5;
        
        int attempts = 0;
        
        boolean won = false;
         
        while (attempts < maxTries) {

            System.out.print("Guess the correct number between 1 - 100: ");
            int userInput = inputCollector.nextInt();
                
            count++;
            
            if (userInput != random && random > userInput) {
                System.out.printf("%d. Wrong! The number is higher\n", random = randomNumbers.nextInt(100) + 1);
            }
            else if (userInput != random && random < userInput) {
                System.out.printf("%d. Wrong! The number is lower\n", random = randomNumbers.nextInt(100) + 1);
            }
            else if (userInput == random) {
                System.out.println("Correct");
                break;
            }
            else if (userInput < 1 || userInput > 100) {
                System.out.println("Out of bound");
            }
            
            
                
        } 
        
//        for (guess = 0; guess <= 5; guess++) {
//                if (userInput == random){
//                    guess++;
//                    System.out.println(guess);                    
//                }
//                
//                if (guess == 1) {
//                    System.out.println("Legendary");
//                }
//                else if (guess == 2) {
//                    System.out.println("Excellent");
//                }
//                else if (guess > 3 && guess <= 4) {
//                    System.out.println("Good");
//                }
//                else if (guess == 5) {
//                    System.out.println("Close!");
//                } 
//                else {
//                    System.out.println("Better luck");
//                }
//            }
        
//        System.out.println(random);
    }
}


