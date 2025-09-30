package FileStructFive.scr.twelveComparisonOperatorsEX22;

public class EquationIntro {
    public static void main(String[] args) {
        //4 Accounting equation variables
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        //5 Comparison operators
        boolean isAssetsGreater = assets > liabilities; // Greater than
        boolean isLiabilitiesLess = liabilities < assets; // Less than
        boolean isEqual = equity == 60; // Equal to
        boolean isAssetsGreaterOrEqual = assets >= 100; // Greater than or equal
        boolean isLiabilitiesLessOrEqual = liabilities <= 40; // Less than or equal
        boolean isNotEqual = equity != 50; // Not equal

        //6 Print results
        System.out.println("Is Assets > Liabilities? " + isAssetsGreater);
        System.out.println("Is Liabilities < Assets? " + isLiabilitiesLess);
        System.out.println("Is Equity == 60? " + isEqual);
        System.out.println("Is Assets >= 100? " + isAssetsGreaterOrEqual);
        System.out.println("Is Liabilities <= 40? " + isLiabilitiesLessOrEqual);
        System.out.println("Is Equity != 50? " + isNotEqual);

    }
}
