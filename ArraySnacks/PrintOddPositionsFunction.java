public class PrintOddPositionsFunction {

    public static void main(String[] args) {
    
        int[] numbers = {20, 30, 40, 50, 70};
        
        printOddPositions(numbers);
    
    }

    public static void printOddPositions(int[] array) {
        for (int number = 0; number < array.length; number+=2) {
            System.out.println(array[number] + " ");
        }
        
    }
    
}
