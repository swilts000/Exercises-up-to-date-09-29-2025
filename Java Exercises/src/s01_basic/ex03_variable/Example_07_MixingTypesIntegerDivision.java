package s01_basic.ex03_variable;

public class Example_07_MixingTypesIntegerDivision {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int r1 = a / b;               // integer division -> 2
        double r2 = a / (double) b;   // make one a double -> 2.5

        System.out.println(r1); // 2 (not 2.5)
        System.out.println(r2); // 2.5
    }
}
