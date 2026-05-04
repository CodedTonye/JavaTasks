//A function that takes an array and output an array containing the elements in the even index.

public class TaskFour {

    public static void evenPositions(int[] array) {
        for (int count = 2; count < array.length; count += 2) {
            System.out.print(array[count] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 8, 3, 1};

        System.out.print("Elements at even positions: ");
        evenPositions(numbers);
    }
}
