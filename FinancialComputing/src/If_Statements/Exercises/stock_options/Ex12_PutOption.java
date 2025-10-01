package If_Statements.Exercises.stock_options;

public class Ex12_PutOption {
    public static void main(String[] args) {
        // Current stock price
        double stockPrice = 80;
        // Strike price of the put option
        double strikePrice = 100;

        // Check if stock price is lower than strike price
        if (stockPrice < strikePrice) {
            System.out.println("Put option is profitable!");
        } else {
            System.out.println("Put option is not profitable yet.");
        }
    }
}
