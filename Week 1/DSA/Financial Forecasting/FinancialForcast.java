public class FinancialForcast{

    public static double calculateFutureValue(double currentValue, double growthRate, int years){
        if(years == 0){
            return currentValue;
        }

        return (1 + growthRate) * calculateFutureValue(currentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;
        double growthRate = 0.25;
        int years = 5;

        double futureValue = calculateFutureValue(currentValue, growthRate, years);
        System.out.printf("Future Value (After %d Years): %.2f\n", years, futureValue);
    }
}