package FileStructThree.scr.fiveLargeNumberVariable;

public class EquationExampleMixed {
    public static void main(String[] args) {
        double assetsValue = 7_500_000.75; //4 Large double
        int LiabilitiesAmount = 2_500_000; //5 Large int
        double equity_total = assetsValue - LiabilitiesAmount; //6 Calculation
        System.out.println("Assets = Liabilities + Equity"); //7 Print
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
