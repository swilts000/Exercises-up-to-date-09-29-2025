package If_Statements.ExClasswork_ternary_operators;

public class Ex03_CompareNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // 1. Ternary checks if a > b
        // 1a. True → "a is greater than b"
        // 1b. False → "a is less than or equal to b"
        String result = (a > b) ? "a is greater than b" : "a is less than or equal to b";

        System.out.println(result);
    }
}
