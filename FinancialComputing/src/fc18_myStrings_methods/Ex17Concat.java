package fc18_myStrings_methods;

public class Ex17Concat {
    public static void main(String[] args) {
        // 1. Declare two string variables
        String a = "Hello";
        String b = "World";

        // 2. Concatenate using concat() method
        String result = a.concat(" ").concat(b);

        // 3. Print the result
        System.out.println(result); // Output: Hello World

        // 4. Concatenate using + operator (alternative)
        System.out.println(a + " " + b);
    }
}
