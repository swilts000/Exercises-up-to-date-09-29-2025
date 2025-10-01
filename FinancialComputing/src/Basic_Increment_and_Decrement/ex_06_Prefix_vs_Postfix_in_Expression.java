package Basic_Increment_and_Decrement;

public class ex_06_Prefix_vs_Postfix_in_Expression {
    public static void main(String[] args) {
        int c = 5;
        int d = c++ + 10; // c used first, then incremented
        System.out.println("d: " + d); // prints 15
        System.out.println("c: " + c); // prints 6
    }
}
