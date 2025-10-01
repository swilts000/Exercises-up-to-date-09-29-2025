package If_Statements.Exercises.stock_options;

public class Ex15_ExerciseOption {
    public static void main(String[] args) {
        // Stock price
        double stockPrice = 105;
        // Strike price
        double strikePrice = 100;
        // Type of option: "call" or "put"
        String optionType = "call";

        // Check whether to exercise the option
        if (optionType.equals("call") && stockPrice > strikePrice)
        {
            System.out.println("Exercise your Call option!");
        }

        else if (optionType.equals("put") && stockPrice < strikePrice)
        {
            System.out.println("Exercise your Put option!");
        }

        else
        {
            System.out.println("Do not exercise the option.");
        }
    }
}
