package FileStructSix.scr.thirteenLogicalOperators;

public class EquationExampleMixed {
    public static void main(String[] args) {
        double assets = 75.75;
        int liabilities = 25;
        double equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean equal = equity == 50.75;
        boolean less30 = liabilities < 30;

        System.out.println("Greater AND Equal: " + (greater && equal));
        System.out.println("Equal OR Less30: " + (equal || less30));
        System.out.println("NOT Equal: " + (!equal));
    }
}
