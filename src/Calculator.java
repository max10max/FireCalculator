public class Calculator {
    private static final int FIRST_YEAR = 2002;
    private static int index;
    private static double result;

    public static double calculation(int years) {
        index = years - FIRST_YEAR;
        double yearProfit = ((Constants.MOEX_RATE[index-1] * 100) / Constants.MOEX_RATE[index - 2])
                - 100 - Constants.INFLATION_RATE[index];
        if(yearProfit < 0.0) return 0.0;
        double temp = yearProfit % 1;
        if (temp > 0.5) result = (int) yearProfit + 0.5;
        else result = (int) yearProfit;
        return result;
    }

}
