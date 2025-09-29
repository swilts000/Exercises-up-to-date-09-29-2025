package fc18_myStrings_methods;

public class Ex18IsEmpty {
    public static void main(String[] args) {
        // 1. Declare two strings, one empty and one with a space
        String s1 = "";
        String s2 = " ";

        // 2. Use isEmpty() to check if string has length 0
        System.out.println("s1 is empty: " + s1.isEmpty()); // true
        System.out.println("s2 is empty: " + s2.isEmpty()); // false (has a space)
    }
}
