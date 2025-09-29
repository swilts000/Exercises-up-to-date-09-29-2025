package s01_basic.ex02_formatting;

public class Example_25_TableNoArray {
    public static void main(String[] args) {
                // 3. Print top border
                System.out.printf("--------------------------------%n");

                // 4. Print table title
                System.out.printf(" Java's Primitive Types         %n");
                System.out.printf(" (String printf example)        %n");

                // 5. Print header separator
                System.out.printf("--------------------------------%n");

                // 6. Print column headers with formatting
                //    %10s → right-aligned 10 spaces
                //    %-8s → left-aligned 8 spaces
                //    %4s → right-aligned 4 spaces
                System.out.printf("| %10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");

                // 7. Print header separator
                System.out.printf("--------------------------------%n");

                // 8. Print each table row individually using printf

                // Row 1
                System.out.printf("| %-10s | %-8s | %4d |%n", "Floating", "double", 64);

                // Row 2
                System.out.printf("| %-10s | %-8s | %4d |%n", "Floating", "float", 32);

                // Row 3
                System.out.printf("| %-10s | %-8s | %4d |%n", "Integral", "long", 64);

                // Row 4
                System.out.printf("| %-10s | %-8s | %4d |%n", "Integral", "int", 32);

                // Row 5
                System.out.printf("| %-10s | %-8s | %4d |%n", "Integral", "char", 16);

                // Row 6
                System.out.printf("| %-10s | %-8s | %4d |%n", "Integral", "short", 16);

                // Row 7
                System.out.printf("| %-10s | %-8s | %4d |%n", "Integral", "byte", 8);

                // Row 8
                System.out.printf("| %-10s | %-8s | %4d |%n", "Boolean", "boolean", 1);

                // 9. Print bottom border
                System.out.printf("--------------------------------%n");
            }
        }
