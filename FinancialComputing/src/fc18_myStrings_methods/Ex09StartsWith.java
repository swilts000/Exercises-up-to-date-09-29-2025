package fc18_myStrings_methods;

public class Ex09StartsWith {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "Hello World";

        // 2. Use startsWith() to check if the string starts with a specific substring
        boolean starts = text.startsWith("Hello");

        // 3. Print the result
        System.out.println(starts);  // Output: true
    }
}
