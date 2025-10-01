package If_Statements.ExClasswork_ternary_operators;

public class Ex01_PositiveNegative {
    public static void main(String[] args) {
        int number = -5;

//         1. Ternary operator: condition ? value_if_true : value_if_false
//         1a. Checks if number > 0
//         1b. If true → "The number is positive."
//         1c. If false → "The number is negative or zero."




        String result = (number > 0) ? "The number is positive." : "The number is negative or zero.";

        System.out.println(result);

    }
}
