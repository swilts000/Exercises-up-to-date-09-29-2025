package FileStructSeven.scr.fifteenIfElse;

public class FinancialStatusCheck {
    public static void main(String[] args) {
        long assets = 200L;
        long liabilities = 150L;
        long equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        // If-else to check surplus or deficit
        if (equity > 0) {
            System.out.println("Company has surplus");
        } else {
            System.out.println("Company has deficit");
        }

        // Else-if to check if assets are significantly higher than liabilities
        if (assets > 2 * liabilities) {
            System.out.println("Assets are more than double liabilities");
        } else if (assets > liabilities) {
            System.out.println("Assets exceed liabilities but not double");
        } else {
            System.out.println("Assets do not exceed liabilities");
        }
    }
}
