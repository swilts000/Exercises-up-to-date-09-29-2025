package FileStructFive.scr.twelveComparisonOperatorsEX22;

public class EquationExampleSmall {
    public static void main(String[] args) {
        int assets = 50;
        int liabilities = 20;
        int equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean less = liabilities < assets;
        boolean equal = equity == 30;
        boolean greaterOrEqual = assets >= 50;
        boolean lessOrEqual = liabilities <= 20;
        boolean notEqual = equity != 25;

        System.out.println("Assets > Liabilities? " + greater);
        System.out.println("Liabilities < Assets? " + less);
        System.out.println("Equity == 30? " + equal);
        System.out.println("Assets >= 50? " + greaterOrEqual);
        System.out.println("Liabilities <= 20? " + lessOrEqual);
        System.out.println("Equity != 25? " + notEqual);
    }
}
