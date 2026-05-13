public class OshoFreePromoEngine{

    public static String getDiscount(double cartTotal, String promoCode){
    
        double finalPrice;
    
        if (cartTotal < 5000){
            finalPrice = cartTotal;
        }
        else if (cartTotal >= 5000 && promoCode.equals("STARTER10")){
            finalPrice = cartTotal * 0.90;
        }
        else if (cartTotal >= 15000 && promoCode.equals("BIGBOY20")){
            finalPrice = cartTotal * 0.80;
        }
        else if (cartTotal >= 30000 && promoCode.equals("OSHOFREE35")){
            finalPrice = cartTotal * 0.65;
        }
        else {
            return "Invalid promo code - no discount applied";
        }
        
        return "Final price: " + finalPrice;
        
    }

}
