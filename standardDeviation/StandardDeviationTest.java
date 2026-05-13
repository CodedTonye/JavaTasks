import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest {

    @Test
    public void testThatMeanCalculationIsAccurate() {
        double expectedMean = 15.0;
        
        double actualMean = StandardDeviation.calculateMean();
        
        assertEquals(expectedMean, actualMean);
    }
    
    @Test
    public void testThatVarianceCalculationIsAccurate() {
        double expectedMean = 11.33;
        
        double actualMean = StandardDeviation.calculateVariance();
        
        assertEquals(expectedMean, actualMean, 0.01);
    }
    
    @Test
    public void testThatStandardDeviationCalculationIsAccurate() {
        double expectedMean = 3.37;
        
        double actualMean = StandardDeviation.calculateStandardDeviation();
        
        assertEquals(expectedMean, actualMean, 0.01);
    }
}
