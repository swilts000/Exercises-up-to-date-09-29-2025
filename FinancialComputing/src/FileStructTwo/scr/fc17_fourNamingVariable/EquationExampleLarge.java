package FileStructTwo.scr.fc17_fourNamingVariable;

public class EquationExampleLarge {
    public static void main(String[] args) {
        long totalAssets = 200L; //4 camelCase
        byte liabilitiesAmount = 50; //5 camelCase
        long equity_total = totalAssets - liabilitiesAmount; //6 snake_case
        System.out.println("Assets = Liabilities + Equity"); //7 Print
        System.out.println(totalAssets + " = " + liabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
