package FileStructSeven.scr.fifteenIfElse;

public class EquityThresholdCheck {
    public static void main(String[] args) {
        int assets = 50;
        int liabilities = 20;
        int equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        // If-else if-else to check equity threshold
        if (equity >= 30) {
            System.out.println("Equity is sufficient");
        } else if (equity > 0) {
            System.out.println("Equity is low but positive");
        } else {
            System.out.println("Equity is negative");
        }

        // Check if assets equal liabilities
        if (assets == liabilities) {
            System.out.println("Assets equal Liabilities");
        } else {
            System.out.println("Assets do not equal Liabilities");
        }
    }
}
