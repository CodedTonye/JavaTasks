import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
	public void testBelowDiscountThreshold(){
		
		double cartTotal  = 3000;
		String promoCode = "STARTER10";
		String expected = "Final price: 3000.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}

	@Test
	public void testStarter10Discount(){
		
		double cartTotal  = 8000;
		String promoCode = "STARTER10";
		String expected = "Final price: 7200.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testBigBoy20Discount(){
		
		double cartTotal  = 20000;
		String promoCode = "BIGBOY20";
		String expected = "Final price: 16000.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testOshoFree35Discount(){
		
		double cartTotal  = 50000;
		String promoCode = "OSHOFREE35";
		String expected = "Final price: 32500.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidPromoCode(){
		
		double cartTotal  = 18000;
		String promoCode = "FAKE99";
		String expected = "Invalid promo code - no discount applied";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testExactly5000WithStarter10(){
		
		double cartTotal  = 5000;
		String promoCode = "STARTER10";
		String expected = "Final price: 4500.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testExactly15000WithBigBoy20(){
		
		double cartTotal  = 15000;
		String promoCode = "BIGBOY20";
		String expected = "Final price: 12000.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testExactly30000WithOshoFree35(){
		
		double cartTotal  = 30000;
		String promoCode = "OSHOFREE35";
		String expected = "Final price: 19500.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidAmount(){
		
		double cartTotal  = -500;
		String promoCode = "STARTER10";
		String expected = "Final price: -500.0";
		
		String actual = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);

		assertEquals(expected, actual);
	}
}


