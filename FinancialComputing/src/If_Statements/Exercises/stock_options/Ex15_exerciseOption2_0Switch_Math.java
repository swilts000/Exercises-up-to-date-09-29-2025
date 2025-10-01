package If_Statements.Exercises.stock_options;

public class Ex15_exerciseOption2_0Switch_Math {
    public static void main(String[] args) {
        // ---------------- Section 1: Inputs ----------------
        // 1. Current stock price
        double stockPrice = 300;

        // 2. Strike price (price agreed in the option contract)
        double strikePrice = 200;

        // 3. Option type: "call" or "put"
        String optionType = "put";

        // 4. Premium paid for option (cost to buy it)
        double premium = 5;

        // ---------------- Section 2: Use Switch ----------------
        switch (optionType) {
            case "call": {
                // Profit = max(0, stockPrice - strikePrice) - premium
                double intrinsicValue = Math.max(0, stockPrice - strikePrice);
                double profit = intrinsicValue - premium;

                // Use ternary to decide exercise
                String decision = (intrinsicValue > 0)
                        ? "Exercise your Call option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";

                System.out.println(decision);
                System.out.println("Intrinsic Value = " + intrinsicValue);
                System.out.println("Profit after premium = " + profit);

                // Extra Math: Break-even point = strikePrice + premium
                double breakEven = strikePrice + premium;
                System.out.println("Break-even stock price = " + breakEven);

                // Advanced math fun:
                System.out.println("Profit squared (Math.pow) = " + Math.pow(profit, 2));
                System.out.println("Absolute profit (Math.abs) = " + Math.abs(profit));
                System.out.println("Square root of strike price = " + Math.sqrt(strikePrice));
                break;
            }

            case "put": {
                // Profit = max(0, strikePrice - stockPrice) - premium
                double intrinsicValue = Math.max(0, strikePrice - stockPrice);
                double profit = intrinsicValue - premium;

                // Use ternary to decide exercise
                String decision = (intrinsicValue > 0)
                        ? "Exercise your Put option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";

                System.out.println(decision);
                System.out.println("Intrinsic Value = " + intrinsicValue);
                System.out.println("Profit after premium = " + profit);

                // Extra Math: Break-even point = strikePrice - premium
                double breakEven = strikePrice - premium;
                System.out.println("Break-even stock price = " + breakEven);

                // Advanced math fun:
                System.out.println("Profit squared (Math.pow) = " + Math.pow(profit, 2));
                System.out.println("Absolute profit (Math.abs) = " + Math.abs(profit));
                System.out.println("Square root of strike price = " + Math.sqrt(strikePrice));
                break;
            }

            default:
                System.out.println("Invalid option type! Must be 'call' or 'put'.");
        }
    }
}

