package fc18_myStrings_methods;

public class Ex13Replace {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "apple";

        // 2. Replace a single character with another character
        String replacedChar = text.replace('p', 'b');

        // 3. Replace a substring with another substring
        String replacedSub = text.replace("pp", "zz");

        // 4. Print the results
        System.out.println(replacedChar); // Output: abble
        System.out.println(replacedSub);  // Output: azzle
    }
}
