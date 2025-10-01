package If_Statements.ExClasswork_ternary_operators;

public class Ex02_EvenOdd {
    public static void main(String[] args) {
        int number = 7;

        // 1. Ternary operator checks remainder after division by 2
        // 1a. If number % 2 == 0 → "Even number"
        // 1b. Else → "Odd number"
        String result = (number % 2 == 0) ? "Even number" : "Odd number";

        System.out.println(result);
    }
}
