package If_Statements.ExClasswork_ternary_operators;

public class Ex05_DivisibleBy5 {
    public static void main(String[] args) {
        int num = 25;

        // 1. Ternary checks if number divisible by 5
        // 1a. num % 5 == 0 → "Divisible by 5"
        // 1b. Else → "Not divisible by 5"
        String result = (num % 5 == 0) ? "Divisible by 5" : "Not divisible by 5";

        System.out.println(result);
    }
}
