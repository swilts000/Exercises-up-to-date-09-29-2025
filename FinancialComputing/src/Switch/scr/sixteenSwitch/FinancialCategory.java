package Switch.scr.sixteenSwitch;

public class FinancialCategory {
    public  static void main(String[] args) {
        int assets = 120;

        System.out.println("Assets Value: " + assets);

        // Switch to categorize assets
        String category;
        switch (assets) {
            case 50:
                category = "Small Assets";
                break;
            case 100:
                category = "Medium Assets";
                break;
            case 150:
                category = "Large Assets";
                break;
            default:
                category = "Extra Large Assets";
                break;
        }
        System.out.println("Asset Category: " + category);
    }
}
