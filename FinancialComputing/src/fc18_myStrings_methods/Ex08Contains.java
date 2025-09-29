package fc18_myStrings_methods;

public class Ex08Contains {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "Spring Boot Java";

        // 2. Use contains() to check if the string contains a substring
        boolean hasJava = text.contains("Java");

        // 3. Print the result
        System.out.println(hasJava);  // Output: true
    }
}
