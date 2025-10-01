package If_Statements.ExClasswork_ternary_operators;

public class Ex04_PassFail {
    public static void main(String[] args) {
        int marks = 60;

        // 1. Ternary checks if marks >= 50
        // 1a. True → "Pass"
        // 1b. False → "Fail"
        String result = (marks >= 50) ? "Pass" : "Fail";

        System.out.println(result);
    }
}
