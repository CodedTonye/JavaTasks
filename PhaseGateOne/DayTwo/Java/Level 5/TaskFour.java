import java.util.Arrays;

public class TaskFour {

    public static void main(String[] args) {

        int[] array = {45, 60, 3, 0, 67, 2, 45, 3, 22, 0};
        for (int index = 0; index < 10; index++){
        
        System.out.print(Array.toString(array));    

        EliminateDuplicateArrays(array);
        }
    
    }

    public static void EliminateDuplicateArrays(int[] array) {

        for (int index = 0; index <= array.length; index++){
            for (int count = index + 1; count <= array.length; count++){
                if (array[index]!= -1 && array[index] == array[count]){
                    array[count] = -1;
                }
            }
        }

        
        for (int index = 0; index < 10; index++) {
            if (array[index]!= -1 && array[index] >= 10 && array[index] <= 100){
                System.out.print(array[index] + " ");
            }
        }
        
    }
}


