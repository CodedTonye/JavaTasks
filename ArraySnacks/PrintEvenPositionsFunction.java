public class PrintEvenPositionsFunction {

    public static void main(String[] args) {
    
        int[] numbers = {20, 30, 40, 50, 70};
        
        printEvenPositions(numbers);
    
    }

    public static void printEvenPositions(int[] array) {
        for (int number = 1; number < array.length; number+=2) {
            System.out.println(array[number] + " ");
        }
        
    }
    
}
