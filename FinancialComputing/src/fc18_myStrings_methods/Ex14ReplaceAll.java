package fc18_myStrings_methods;

public class Ex14ReplaceAll {
    public static void main(String[] args) {
        // 1. Declare a String variable with numbers
        String text = "user123, id456, code789";

        // 2. Use replaceAll with regex to replace all digits with 'X'
        String result = text.replaceAll("\\d+", "X");

        // 3. Print the result
        System.out.println(result);  // Output: userX, idX, codeX
    }
}
