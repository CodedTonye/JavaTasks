import java.util.Arrays;

public class TaskOne {

    public static int[] sortArray(int array) {
        int[] array = {5,9,3,6,2};
        
        for(int count = 0; count <= array.length; count++) {
            for (int index = 0; index <= array.length; index++) {
                if (array[index] % 2 == 0) {
                 return array;
                }
            }
        }
        
    }

    public static void main(String[] args) {
    
    int[] array = {5,9,3,6,2};
    System.out.println(Arrays.toString(sortedArray(array));
    
    
        
    }
}


















