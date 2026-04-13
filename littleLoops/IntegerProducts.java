public class IntegerProducts {

    public static void main(String[] args) {

        int i = 1;
        int product = 1;

        while (i <= 10) {
            product *= i;
            i++;
        }
        System.out.println("The product of integers from 1 to 10 is: " + product);
    } 
}
