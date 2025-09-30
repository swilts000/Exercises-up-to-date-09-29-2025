package FileStructSix.scr.thirteenLogicalOperators;

public class EquationExampleLarge {
    public static void main(String[] args) {
        long assets = 200L;
        byte liabilities = 50;
        long equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        boolean greater = assets > liabilities;
        boolean equal = equity == 150;
        boolean less60 = liabilities < 60;

        System.out.println("Greater AND Equal: " + (greater && equal));
        System.out.println("Equal OR Less60: " + (equal || less60));
        System.out.println("NOT Equal: " + (!equal));
    }
}
