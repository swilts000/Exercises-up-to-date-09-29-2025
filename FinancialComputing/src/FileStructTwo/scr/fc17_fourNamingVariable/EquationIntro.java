package FileStructTwo.scr.fc17_fourNamingVariable;

public class EquationIntro {
    public static void main(String[] args) {
        int assetsValue = 100; //4 CamelCase variable
        double LiabilitiesAmount = 40.5; //5 PascalCase variable
        double equity_total = assetsValue - LiabilitiesAmount; //6 snake_case variable
        System.out.println("Assets = Liabilities + Equity"); //7 Print equation
        System.out.println(assetsValue + " = " + LiabilitiesAmount + " + " + equity_total); //8 Print numbers
    }
}
