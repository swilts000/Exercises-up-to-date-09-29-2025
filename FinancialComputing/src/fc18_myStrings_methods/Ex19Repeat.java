package fc18_myStrings_methods;

public class Ex19Repeat {
    public static void main(String[] args) {
        // 1. Declare a string
        String s = "ha";

        // 2. Repeat the string 3 times
        System.out.println(s.repeat(3)); // Output: hahaha

        // 3. Repeat another string 10 times
        System.out.println("-".repeat(10)); // Output: ----------

        // 4. Repeat 0 times produces an empty string
        System.out.println("empty:" + s.repeat(0) + ":end");
    }
}
