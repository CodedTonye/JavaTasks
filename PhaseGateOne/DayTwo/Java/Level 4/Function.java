public class Function {

    public static int sum(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum;
    }
    
    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static int getSquareOf(int number) {
        int squared = number * number;
        return squared;
    }
    
    public static int getFahrenheit(int celsius) {
    
        int fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    
    public static boolean isPrime(int number) {
        if (number < 2) return false;
            for (int counter = 2; counter < number; counter++) {
                if (number % counter == 0) return false;
            }
            return true;
    }
    
  
    public static int getLargest(int numberOne, int numberTwo, int numberThree) {
        int largest = numberOne;
        
        if (numberTwo > largest) {
            largest = numberTwo;
        } else if (numberThree > largest) {
            largest = numberThree;
        }
        return largest;   
    }
    
    
    public static double getInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        return interest; 
    }    
    
    
    public static double getAreaOfRectangle(double length, double width) {
        double area = length * width;
        return area; 
    }    
    
    
    public static int reverseNumber(int number) {
        
        
        int reversed = 0;
        
        while (number > 0){
        
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
        }
        return reversed;
    }  

    public static void main(String[] args) {
    System.out.println(sum(2, 4));
    System.out.println(isEven(4));
    System.out.println(getSquareOf(5));
    System.out.println(getFahrenheit(90));
    System.out.println(isPrime(9));
    System.out.println(getLargest(2, 5, 3));
    System.out.println(getInterest(50000, 0.1, 5));  
    System.out.println(getAreaOfRectangle(10, 12));  
    System.out.println(reverseNumber(12345));   
       
    }
}


















