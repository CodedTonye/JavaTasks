public class PalindromeCheckerFunction {

    public static void main(String[] args) {
    
        String word = "hannah";
        System.out.println(word + " is palindrome: " + isPalindrome(word));
    }
    
    public static boolean isPalindrome(String array) {
    
        int start = 0;
        int end = array.length() - 1;
    
        while (start < end) {
            if (array.charAt(start) != array.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
