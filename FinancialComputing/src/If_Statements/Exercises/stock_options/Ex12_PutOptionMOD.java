package If_Statements.Exercises.stock_options;

public class Ex12_PutOptionMOD {
    public static void main(String[] args) {
        // Current stock price
        double stockPrice = 100;
        // Strike price of the put option
        double strikePrice = 100;

        // Check if stock price is lower than strike price
        if (stockPrice < strikePrice) {
            System.out.println("Put option is profitable!");
        } else if (stockPrice == strikePrice) {
            System.out.println("Put option is at the money");
        } else if (stockPrice > strikePrice) {
            System.out.println("Call option is out of the money");
        }
    }
}
