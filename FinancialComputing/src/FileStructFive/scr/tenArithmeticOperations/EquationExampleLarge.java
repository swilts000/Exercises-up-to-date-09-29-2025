package FileStructFive.scr.tenArithmeticOperations;

public class EquationExampleLarge {
    public static void main(String[] args) {
        long assets = 200L;
        byte liabilities = 50;
        long equity = assets - liabilities;

        System.out.println("Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        System.out.println("Addition: " + (assets + liabilities));
        System.out.println("Subtraction: " + (assets - liabilities));
        System.out.println("Multiplication: " + (assets * 2));
        System.out.println("Division: " + (assets / 4));
        System.out.println("Modulus: " + (assets % 7));
        System.out.println("Precedence: " + (assets + liabilities * 3));

    }
}
