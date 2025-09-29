package fc18_myStrings_methods;

public class Ex10EndsWith {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "Hello World";

        // 2. Use endsWith() to check if the string ends with a specific substring
        boolean ends = text.endsWith("World");

        // 3. Print the result
        System.out.println(ends);  // Output: true
    }
}
