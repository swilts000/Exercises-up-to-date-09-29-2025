package FileStructFive.scr.twelveComparisonOperatorsEX22;

public class EquationExampleLarge {
    public static void main(String[] args) {
        long assets = 200L;
        byte liabilities = 50;
        long equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean less = liabilities < assets;
        boolean equal = equity == 150;
        boolean greaterOrEqual = assets >= 200;
        boolean lessOrEqual = liabilities <= 50;
        boolean notEqual = equity != 100;

        System.out.println("Assets > Liabilities? " + greater);
        System.out.println("Liabilities < Assets? " + less);
        System.out.println("Equity == 150? " + equal);
        System.out.println("Assets >= 200? " + greaterOrEqual);
        System.out.println("Liabilities <= 50? " + lessOrEqual);
        System.out.println("Equity != 100? " + notEqual);
    }
}
