package fc18_myStrings_methods;

public class Ex15Trim {
    public static void main(String[] args) {
        // 1. Declare a String variable with spaces at both ends
        String text = "   padded text   ";

        // 2. Print the original string with quotes to show spaces
        System.out.println("Before: '" + text + "'");

        // 3. Use trim() to remove leading and trailing spaces
        String trimmed = text.trim();

        // 4. Print the trimmed string
        System.out.println("After:  '" + trimmed + "'");  // Output: 'padded text'
    }
}
