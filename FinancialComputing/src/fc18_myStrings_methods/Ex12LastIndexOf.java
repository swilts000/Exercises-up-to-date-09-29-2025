package fc18_myStrings_methods;

public class Ex12LastIndexOf {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "abracadabra";

        // 2. Use lastIndexOf(char) to find the last occurrence of a character
        int lastChar = text.lastIndexOf('a');

        // 3. Use lastIndexOf(String) to find the last occurrence of a substring
        int lastSub = text.lastIndexOf("bra");

        // 4. Print the results
        System.out.println("Last index of 'a': " + lastChar);   // Output: 10
        System.out.println("Last index of \"bra\": " + lastSub); // Output: 8
    }
}
