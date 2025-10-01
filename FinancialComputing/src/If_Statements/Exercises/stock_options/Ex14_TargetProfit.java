package If_Statements.Exercises.stock_options;

public class Ex14_TargetProfit {
    public static void main(String[] args) {
        // Profit earned
        double profit = 50;
        // Target profit
        double target = 100;

        // Check if target profit reached
        if (profit >= target)
        {
            System.out.println("Time to sell and take profit!");
        }
        else
        {
            System.out.println("Keep holding the option.");
        }
    }
}
