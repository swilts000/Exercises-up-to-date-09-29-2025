package FileStructThree.scr.fiveLargeNumberVariable;

public class EquationExampleLarge {
    public static void main(String[] args) {
        long totalAssets = 10_000_000L; //4 Large long
        byte liabilitiesAmount = 50; //5 small byte
        long equity_total = totalAssets - liabilitiesAmount; //6 Calculation
        System.out.println("Assets = Liabilities + Equity"); //7 Print
        System.out.println(totalAssets + " = " + liabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
