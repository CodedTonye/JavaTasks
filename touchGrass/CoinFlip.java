import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Random random = new Random();
        
        int heads = 0;
        int tails = 0;
        int totalFlips = 1000000;
        
        for (int counter = 0; counter < totalFlips; counter++) {
            int flip = random.nextInt(2);
            
            if (flip == 0) {
                heads++;
            }
            else {
                tails++;
            }
        }
        
        System.out.println("Total Flips: " + totalFlips);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
