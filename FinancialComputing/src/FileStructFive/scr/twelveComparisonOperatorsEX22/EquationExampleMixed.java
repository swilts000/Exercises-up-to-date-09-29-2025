package FileStructFive.scr.twelveComparisonOperatorsEX22;

public class EquationExampleMixed {
    public static void main(String[] args) {
        double assets = 75.75;
        int liabilities = 25;
        double equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean less = liabilities < assets;
        boolean equal = equity == 50.75;
        boolean greaterOrEqual = assets >= 75.75;
        boolean lessOrEqual = liabilities <= 25;
        boolean notEqual = equity != 60;

        System.out.println("Assets > Liabilities? " + greater);
        System.out.println("Liabilities < Assets? " + less);
        System.out.println("Equity == 50.75? " + equal);
        System.out.println("Assets >= 75.75? " + greaterOrEqual);
        System.out.println("Liabilities <= 25? " + lessOrEqual);
        System.out.println("Equity != 60? " + notEqual);
    }
}
