import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BackToSenderTest {
    
    @Test
    public void testForLessThan50Percent() {
        //given
        int deliveryNumber = 45;
        
        //when
        double expectedSum = BackToSender.calculateWages(deliveryNumber);
        
        double actualSum = 12200.00;
        
        //check
        assertEquals(actualSum, expectedSum);
    }
    
    @Test
    public void testFor50To59Percent() {
        //given
        int deliveryNumber = 55;
        
        //when
        double expectedSum = BackToSender.calculateWages(deliveryNumber);
        
        double actualSum = 16000.00;
        
        //check
        assertEquals(actualSum, expectedSum);
        
    }
    
    @Test
    public void testFor60To69Percent() {
        //given
        int deliveryNumber = 65;
        
        //when
        double expectedSum = BackToSender.calculateWages(deliveryNumber);
        
        double actualSum = 21250.00;
        
        //check
        assertEquals(actualSum, expectedSum);
        
    }
    
    @Test
    public void testFor70PercentAndAbove() {
        //given
        int deliveryNumber = 80;
        
        //when
        double expectedSum = BackToSender.calculateWages(deliveryNumber);
        
        double actualSum = 45000.00;
        
        //check
        assertEquals(actualSum, expectedSum);
        
    }
}


































