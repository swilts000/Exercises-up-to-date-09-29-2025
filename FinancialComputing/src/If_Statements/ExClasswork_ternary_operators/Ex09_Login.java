package If_Statements.ExClasswork_ternary_operators;

public class Ex09_Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        // 1. Ternary checks if both username and password match
        // 1a. True → "Login successful"
        // 1b. False → "Login failed"
        String result = (username.equals("admin") && password.equals("1234")) ? "Login successful" : "Login failed";

        System.out.println(result);
    }
}
