package If_Statements.Exercises.stock_options;

public class Ex15_ExerciseOptionMOD {
    public static void main(String[] args) {
        // Stock price
        double stockPrice = 100;
        // Strike price
        double strikePrice = 100;
        // Type of option: "call" or "put"
        String optionType = "Money";

        // Check whether to exercise the option
        if (optionType.equals("call") && stockPrice > strikePrice)
        {
            System.out.println("Exercise your Call option!");
        }

        else if (optionType.equals("put") && stockPrice < strikePrice)
        {
            System.out.println("Exercise your Put option!");
        }

        else if (stockPrice == strikePrice)
        {
            System.out.println("At the money");
        }else
            {
            System.out.println("Invalid option!");
            }
    }
}
