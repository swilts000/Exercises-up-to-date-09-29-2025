package FileStructFive.scr.tenArithmeticOperations;

public class EquationExampleMixed {
    public static void main(String[] args) {
        double assets = 75.75;
        int liabilities = 25;
        double equity = assets - liabilities;

        System.out.println("Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        System.out.println("Addition: " + (assets + liabilities));
        System.out.println("Subtraction: " + (assets - liabilities));
        System.out.println("Multiplication: " + (assets * 2));
        System.out.println("Division: " + (assets / 5));
        System.out.println("Modulus: " + (assets % 7));
        System.out.println("Precedence: " + (assets + liabilities * 2));

    }
}
