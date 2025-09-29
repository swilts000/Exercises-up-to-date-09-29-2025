package fc18_myStrings_methods;

public class Ex06Equals {
    public static void main(String[] args) {
        // 1. Declare two String variables
        String a = "Java";
        String b = "java";

        // 2. Use equals() method to compare the content of strings (case-sensitive)
        boolean result = a.equals(b);

        // 3. Print the result
        System.out.println(result);  // Output: false, because 'J' != 'j'
    }
}
