public class ArrayElementCheckerFunction {

    public static void main(String[] args) {
    
        int[] numbers = {30, 40, 50, 60, 70};
        int target = 50;
        
        if (elementChecker(numbers, target)) {
            System.out.println(target + " was found!");
        }
        else {
            System.out.println(target + " was not found in array!");
        }


    }

    public static boolean elementChecker(int[] array, int target) {
        for (int number = 0; number < array.length; number++) {
            if(array[number] == target) {
                return true;
            
            }

        }
        return false;
    }
}
