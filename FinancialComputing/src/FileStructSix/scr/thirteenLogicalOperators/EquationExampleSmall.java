package FileStructSix.scr.thirteenLogicalOperators;

public class EquationExampleSmall {
    public static void main(String[] args) {
        int assets = 50;
        int liabilities = 20;
        int equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean equal = equity == 30;
        boolean less50 = liabilities < 50;

        System.out.println("Greater AND Equal: " + (greater && equal));
        System.out.println("Equal OR Less50: " + (equal || less50));
        System.out.println("NOT Equal: " + (!equal));
    }
}
