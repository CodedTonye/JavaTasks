import java.util.Scanner;

public class DisplayReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        reverse(input.nextInt());
    }

    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }
}
