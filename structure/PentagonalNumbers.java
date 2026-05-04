public class PentagonalNumbers {
    public static void main(String[] args) {
       
        for (int counter = 1; counter <= 100; counter++) {
            System.out.printf("%7d", getPentagonalNumber(counter)); 
            if (counter % 10 == 0) System.out.println();
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

