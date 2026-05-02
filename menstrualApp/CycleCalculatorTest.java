import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CycleCalculatorTest {

    @Test
    public void testThatNextPeriodDateIsCorrect() {
        // Given
        int startDay = 2;
        int cycleLength = 28;
        
        // When
        int actualDay = CycleCalculator.calculateDay("Test", startDay, cycleLength);

        // Check
        int expectedDay = 30;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatOvulationDayIsCorrect() {
        // Given
        int startDay = 2;
        int cycleLength = 28;
        int ovulationOffset = cycleLength - 14; 
        
        // When
        int actualDay = CycleCalculator.calculateDay("Test", startDay, ovulationOffset);

        // Check
        int expectedDay = 16;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatFertileStartIsCorrect() {
        // Given
        int startDay = 2;
        int cycleLength = 28;
        int fertileOffset = (28 - 14) - 5; // Day 9 of cycle
        
        // When
        int actualDay = CycleCalculator.calculateDay("Test", startDay, fertileOffset);

        // Check
        int expectedDay = 11;
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testThatSafePeriodStartIsCorrect() {
        // Given
        int startDay = 2;
        int cycleLength = 28;
        int safeOffset = (28 - 14) + 2; // Day 16 of cycle
        
        // When
        int actualDay = CycleCalculator.calculateDay("Test", startDay, safeOffset);

        // Check
        int expectedDay = 18;
        assertEquals(expectedDay, actualDay);
    }
}
