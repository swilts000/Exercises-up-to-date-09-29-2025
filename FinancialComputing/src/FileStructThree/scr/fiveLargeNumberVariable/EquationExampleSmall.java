package FileStructThree.scr.fiveLargeNumberVariable;

public class EquationExampleSmall {
    public static void main(String[] args) {
        float assetsValue = 750_000.5f; //4 Large float with f
        short LiabilitiesAmount = 20; //5 small short for example
        float equity_total = assetsValue - LiabilitiesAmount; //6 Calculation
        System.out.println("Assets = Liabilities + Equity"); //7 Print equation
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
