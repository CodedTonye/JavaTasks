public class BackToSender {

    public static double calculateWages(int deliveryNumber) {
        double basePay = 5000.00;
        double actualSum = 0;
    
        if (deliveryNumber < 50) {
            int amountPerParcel = 160;
                actualSum = (deliveryNumber * amountPerParcel);
        } 
        
        else if (deliveryNumber >= 50 && deliveryNumber <= 59) {
            int amountPerParcel = 200;
                actualSum = (deliveryNumber * amountPerParcel);
        } 
        
        else if (deliveryNumber >= 60 && deliveryNumber <= 69) {
            int amountPerParcel = 250;
                actualSum = (deliveryNumber * amountPerParcel);
        } 
        
        else {
            actualSum = (deliveryNumber * 500);
        } 
        return actualSum + basePay;
        
    }
}
