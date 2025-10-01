package If_Statements.Exercises.stock_options;

public class Ex11_CallOptionMOD {
        public static void main(String[] args) {
            // Current stock price
            double stockPrice = 100;
            // Strike price of the call option
            double strikePrice = 120;

            // Check if stock price is higher than strike price
            if (stockPrice > strikePrice) {
                System.out.println("Call option is profitable!");
            } else if (stockPrice == strikePrice) {
                System.out.println("Call option is at the money");
            } else if (stockPrice < strikePrice) {
                System.out.println("Call option is out of the money");
            }
    }
}
