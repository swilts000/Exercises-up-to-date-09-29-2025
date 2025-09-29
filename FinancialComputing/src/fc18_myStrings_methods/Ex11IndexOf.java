package fc18_myStrings_methods;

public class Ex11IndexOf {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "sharif";

        // 2. Use indexOf(char) to find the first occurrence of a character
        int indexChar = text.indexOf('f');

        // 3. Use indexOf(String) to find the first occurrence of a substring
        int indexStr = text.indexOf("rif");

        // 4. Print the results
        System.out.println("Index of 's': " + indexChar);  // Output: 1
        System.out.println("Index of \"na\": " + indexStr); // Output: 2
    }
}
