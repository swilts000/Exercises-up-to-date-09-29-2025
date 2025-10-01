package Switch.scr.sixteenSwitch;

public class FinancialDecisionSwitch {
    public static void main(String[] args) {
        int assets = 200;
        int liabilities = 150;
        int equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        // Switch-case for decision based on equity
        String decision;
        switch (equity) {
            case 0:
                decision = "Break-even";
                break;
            case 50:
                decision = "Small Surplus";
                break;
            case 100:
                decision = "Moderate Surplus";
                break;
            case 200:
                decision = "Large Surplus";
                break;
            default:
                decision = "Other Surplus/Deficit";
                break;
        }
        System.out.println("Financial Decision: " + decision);

    }
}
