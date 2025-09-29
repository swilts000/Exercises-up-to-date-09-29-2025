package fc18_myStrings_methods;

public class Ex05Substring {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "Programming";

        // 2. Use substring(start, end) to get part of the string
        //    start index is inclusive, end index is exclusive
        String part = text.substring(3, 7); // characters at index 3,4,5,6

        // 3. Print the substring
        System.out.println(part);  // Output: gram
    }
}
