public class StandardDeviation {
    
    public static double calculateMean() {
        double[] numbers = {18, 12, 15, 20, 10, 15};
        double sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        return sum / numbers.length;
    }
    
    public static double calculateVariance() {
        double[] numbers = {18, 12, 15, 20, 10, 15};
        double mean = calculateMean();
        double sumOfSquaredDifferences = 0;
        for (int index = 0; index < numbers.length; index++) {
            double difference = numbers[index] - mean;
            double squaredDifference = difference * difference;
            sumOfSquaredDifferences += squaredDifference; 
        }
        return sumOfSquaredDifferences / numbers.length;
    }
    
    public static double calculateStandardDeviation() {
        double variance = calculateVariance();
        double StandardDeviation = Math.sqrt(variance);
        return StandardDeviation;
    }
}
