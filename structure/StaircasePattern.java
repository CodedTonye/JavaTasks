import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter integer: ");
        displayPattern(inputCollector.nextInt());
    }

    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
 
            for (int space = n - row; space > 0; space--) System.out.print("  ");
           
            for (int counter = row; counter >= 1; counter--) System.out.print(counter + " ");
            System.out.println();
        }
    }
}
