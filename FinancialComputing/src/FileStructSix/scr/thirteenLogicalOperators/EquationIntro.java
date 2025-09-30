package FileStructSix.scr.thirteenLogicalOperators;

public class EquationIntro {
    public static void main(String[] args) {
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        //4 Comparison booleans
        boolean assetsGreater = assets > liabilities; // true
        boolean equityEquals60 = equity == 60;       // true
        boolean liabilitiesLess50 = liabilities < 50; // true

        //5 Logical AND
        boolean andResult = assetsGreater && equityEquals60;
        System.out.println("Assets>Liabilities AND Equity==60: " + andResult);

        //6 Logical OR
        boolean orResult = equityEquals60 || liabilitiesLess50;
        System.out.println("Equity==60 OR Liabilities<50: " + orResult);

        //7 Logical NOT
        boolean notResult = !equityEquals60;
        System.out.println("NOT Equity==60: " + notResult);
    }
}
