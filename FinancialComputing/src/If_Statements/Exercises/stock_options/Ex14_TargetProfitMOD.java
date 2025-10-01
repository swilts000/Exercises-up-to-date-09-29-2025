package If_Statements.Exercises.stock_options;

public class Ex14_TargetProfitMOD {
    public static void main(String[] args) {
        // Profit

        double profit = 200;
        // Profit earned
        double profitEarned = 2 * profit;
        // Target profit
        double target = 100;

        // Check if target profit reached
        if (profit >= 2*target)
        {
            System.out.println("Huge success");
        }
        else if (profitEarned >= target && profit < 2*target )
        {
            System.out.println("Time to sell and take profit!");
        }
        else if (profit > 0 && profit < target)
        {
            System.out.println("Small profit, keep pushing!");
        } else if (profit < 0) {
            System.out.println("Loss occurred, reconsider your strategy.");
        }
    }
}
