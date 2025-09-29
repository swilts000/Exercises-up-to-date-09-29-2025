package fc18_myStrings_methods;

public class Ex07EqualsIgnoreCase {
    public static void main(String[] args) {
        // 1. Declare two String variables
        String a = "Java";
        String b = "java";

        // 2. Use equalsIgnoreCase() to compare strings ignoring case
        boolean result = a.equalsIgnoreCase(b);
        // 3. Print the result
        System.out.println(result);  // Output: true
    }
}