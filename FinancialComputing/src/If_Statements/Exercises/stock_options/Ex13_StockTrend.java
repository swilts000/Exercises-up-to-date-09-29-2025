package If_Statements.Exercises.stock_options;

public class Ex13_StockTrend {
    public static void main(String[] args) {
        // Trend of the stock: "up", "down", or "flat"
        String trend = "up";

        // Decide action based on trend
        if (trend.equals("up"))
        {
            System.out.println("Consider buying a Call option.");
        }
        else if (trend.equals("down"))
        {
            System.out.println("Consider buying a Put option.");
        }
        else
        {
            System.out.println("Hold the stock for now.");
        }
    }
}
