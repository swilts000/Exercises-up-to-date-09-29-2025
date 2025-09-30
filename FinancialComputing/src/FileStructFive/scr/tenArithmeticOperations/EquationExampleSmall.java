package FileStructFive.scr.tenArithmeticOperations;

public class EquationExampleSmall {
    public static void main(String[] args) {
        int assets = 50;
        int liabilities = 20;
        int equity = assets - liabilities;

        System.out.println("Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        // Arithmetic examples
        System.out.println("Addition: " + (assets + liabilities));
        System.out.println("Subtraction: " + (assets - liabilities));
        System.out.println("Multiplication: " + (assets * 3));
        System.out.println("Division: " + (assets / 2));
        System.out.println("Modulus: " + (assets % 7));
        System.out.println("Precedence: " + (assets + liabilities * 2));
    }
}
