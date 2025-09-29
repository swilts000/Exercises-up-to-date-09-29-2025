package FileStructThree.scr.fiveLargeNumberVariable;

public class EquationIntro {
    public static void main(String[] args) {
        long assetsValue = 1_000_000L; //4 Large long number with L
        double LiabilitiesAmount = 500_000.5; //5 Large double
        double equity_total = assetsValue - LiabilitiesAmount; //6 Calculation
        System.out.println("Assets = Liabilities + Equity"); //7 Print equation
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
