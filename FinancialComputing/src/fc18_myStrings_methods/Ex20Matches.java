package fc18_myStrings_methods;

public class Ex20Matches {
    public static void main(String[] args) {
        // 1. Declare an email string
        String email = "user@example.com";

        // 2. Use matches() with a simple regex pattern to check format
        boolean ok = email.matches("\\w+@\\w+\\.\\w+");

        // 3. Print the result
        System.out.println("Email matches basic pattern: " + ok); // Output: true
    }
}
