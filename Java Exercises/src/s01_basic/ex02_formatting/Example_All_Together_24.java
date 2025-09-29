package s01_basic.ex02_formatting;

public class Example_All_Together_24 {
    public static void main(String[] args) {
        // 1. Declare example variables
        char letter = 'A';          // Character example
        boolean flag = true;        // Boolean example
        int number = 42;            // Integer example
        double price = 123.456;     // Decimal example
        String name = "Alice";      // String example

        // ==============================
        // Example 1: Without Width/Precision
        // ==============================
        System.out.println("=== Example 1: Without Width/Precision ===");
        // 1.1 Print character normally
        System.out.printf("Char: %c\n", letter);
        // 1.2 Print boolean normally
        System.out.printf("Boolean: %b\n", flag);
        // 1.3 Print integer normally
        System.out.printf("Integer: %d\n", number);
        // 1.4 Print decimal normally (default 6 decimal places)
        System.out.printf("Decimal: %f\n", price);
        // 1.5 Print string normally
        System.out.printf("String: %s\n", name);

        // ==============================
        // Example 2: With Width/Precision
        // ==============================
        System.out.println("\n=== Example 2: With Width/Precision ===");
        // 2.1 Character in a box 5 spaces wide (right-aligned)
        System.out.printf("Char: %5c\n", letter);
        // 2.2 Boolean in a box 6 spaces wide (right-aligned)
        System.out.printf("Boolean: %6b\n", flag);
        // 2.3 Integer in a box 5 spaces wide (right-aligned)
        System.out.printf("Integer: %5d\n", number);
        // 2.4 Decimal in a box 10 spaces wide, 2 digits after decimal
        System.out.printf("Decimal: %10.2f\n", price);
        // 2.5 String in a box 12 spaces wide, right-aligned
        System.out.printf("String: %12s\n", name);

        // ==============================
        // Example 3: With Alignment
        // ==============================
        System.out.println("\n=== Example 3: With Alignment (Left-Aligned) ===");
        // 3.1 Character left-aligned in 5-space box
        System.out.printf("Char: %-5c|\n", letter);          // '-' makes it left-aligned
        // 3.2 Boolean left-aligned in 6-space box
        System.out.printf("Boolean: %-6b|\n", flag);        // '-' left-aligns the value
        // 3.3 Integer left-aligned in 5-space box
        System.out.printf("Integer: %-5d|\n", number);
        // 3.4 Decimal left-aligned in 10-space box, 2 decimal digits
        System.out.printf("Decimal: %-10.2f|\n", price);
        // 3.5 String left-aligned in 12-space box
        System.out.printf("String: %-12s|\n", name);
    }
}
