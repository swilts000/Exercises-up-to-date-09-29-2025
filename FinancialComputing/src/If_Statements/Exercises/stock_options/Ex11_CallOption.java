package If_Statements.Exercises.stock_options;

public class Ex11_CallOption {
    public static void main(String[] args) {
        // Current stock price
        double stockPrice = 120;
        // Strike price of the call option
        double strikePrice = 100;

        // Check if stock price is higher than strike price
        if (stockPrice > strikePrice) {
            System.out.println("Call option is profitable!");
        } else {
            System.out.println("Call option is not profitable yet.");
        }
    }
}
