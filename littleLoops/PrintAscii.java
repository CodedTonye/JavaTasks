public class PrintAscii {

    public static void main(String[] args) {

        System.out.println("Character : ASCII Value");

        for (char ch = 'A'; ch <= 'Z'; ch++) {

        int asciiValue = (int) ch;
        System.out.println(ch + "         :    " + asciiValue);        

        }
    }
}
