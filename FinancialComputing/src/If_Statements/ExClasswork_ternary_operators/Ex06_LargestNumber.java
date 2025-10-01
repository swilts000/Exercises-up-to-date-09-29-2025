package If_Statements.ExClasswork_ternary_operators;

public class Ex06_LargestNumber {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 15;

        // 1. Nested ternary to find largest number
        // 1a. If x > y and x > z → "x is largest"
        // 1b. Else if y > z → "y is largest"
        // 1c. Else → "z is largest"
        String result = (x > y && x > z) ? "x is largest" : (y > z ? "y is largest" : "z is largest");

        System.out.println(result);
    }
}
