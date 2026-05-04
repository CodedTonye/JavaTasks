//A function that takes an array and output an array containing the elements in the odd index.

public class TaskFive {

    public static void oddPositions(int[] array) {
        for (int count = 0; count < array.length; count++) {
            
            if (count % 2 != 0) 
            System.out.print(array[count] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 8, 3, 1};

        System.out.print("Elements at odd positions: ");
        oddPositions(numbers);
    }
}
