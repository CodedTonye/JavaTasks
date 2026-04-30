public class LargestArrayNumberFunction {

    public static void main(String[] args) {
    
        int[] myNumbers = {12, 48, 40, 6, 54, 8};
    
        int highestNumber = getHighest(myNumbers);
    
        System.out.println("The Largest number is: " + highestNumber);
        
    
    }


    public static int getHighest(int[] array) {
        int largest = array[0];
        
        for (int counter = 1; counter < array.length; counter++) {
            if (array[counter] > largest) {
                largest = array[counter];
            }
        }
        return largest;
    }
}

