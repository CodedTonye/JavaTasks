public class RunningTotalArrayFunction {

    public static void main(String[] args) {
    
        int[] numbers = {12, 48, 40, 6, 54, 8};
    
        runningTotal(numbers);

    }


    public static int runningTotal(int[] array) {
        int total = 0;
        
        for (int number = 0; number < array.length; number++) {
            total += array[number];
            
            System.out.print(total + " ");
             
        }
        return total;
    } 
}


