public class TaskTen {

    public static void main(String[] args) {
            
        String number = "12345";
        
        int reversed = 0;
        
        while (number > 0){
        
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
            
        }
        System.out.println(reversed);
    }
}
