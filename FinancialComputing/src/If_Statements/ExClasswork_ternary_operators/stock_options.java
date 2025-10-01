package If_Statements.ExClasswork_ternary_operators;

import java.util.Scanner;

public class stock_options {
    public static void main(String[] args) {
        // 1. Declare stock price
        double stockPrice = 100;

        // 2. Declare strike price
        double strikePrice = 200;

        // 3. Declare option type: can be "call" or "put"
        String optionType = new Scanner(System.in).nextLine();

        // ---------------- Section 4: Use Switch ----------------
        switch (optionType) {
            case "call":
                // 4a. For call option → use ternary operator to decide
                String callDecision = (stockPrice > strikePrice)
                        ? "Exercise your Call option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";
                System.out.println(callDecision);
                break;

            case "put":
                // 4b. For put option → use ternary operator to decide
                String putDecision = (stockPrice < strikePrice)
                        ? "Exercise your Put option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";
                System.out.println(putDecision);
                break;

            default:
                // 4c. Handle invalid option type
                System.out.println("Invalid option type! Must be 'call' or 'put'.");

        }
    }
}
