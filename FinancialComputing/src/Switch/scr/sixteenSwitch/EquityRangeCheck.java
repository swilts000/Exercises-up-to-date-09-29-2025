package Switch.scr.sixteenSwitch;

public class EquityRangeCheck {
    public static void main(String[] args) {
        int equity = 50;

        System.out.println("Equity Value: " + equity);

        // Switch-case to check equity ranges
        String status;
        switch (equity / 25) { // divide equity into 25-unit ranges
            case 0:
                status = "Very Low Equity";
                break;
            case 1:
                status = "Low Equity";
                break;
            case 2:
                status = "Moderate Equity";
                break;
            case 3:
                status = "High Equity";
                break;
            default:
                status = "Very High Equity";
                break;

        }
        System.out.println(status);
    }
}
