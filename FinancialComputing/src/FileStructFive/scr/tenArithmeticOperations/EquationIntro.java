package FileStructFive.scr.tenArithmeticOperations;

public class EquationIntro {
    public static void main(String[] args) {
        //4 Accounting equation variables
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        //5 Print the accounting equation
        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        //6 Arithmetic operations
        System.out.println("\nArithmetic Operations Examples:");
        System.out.println("Addition: " + assets + " + " + liabilities + " = " + (assets + liabilities));
        System.out.println("Subtraction: " + assets + " - " + liabilities + " = " + (assets - liabilities));
        System.out.println("Multiplication: " + assets + " * 2 = " + (assets * 2));
        System.out.println("Division: " + assets + " / 4 = " + (assets / 4));
        System.out.println("Modulus: " + assets + " % 3 = " + (assets % 3));

        //7 Operator precedence example
        System.out.println("Operator Precedence: " + assets + " + " + liabilities + " * 2 = " + (assets + liabilities * 2));
    }
}
