package s01_basic.ex03_variable;

public class Example_06_CastingOverflow {
    public static void main(String[] args) {
        int bigNumber = 130;
        byte tiny = (byte) bigNumber; // explicit cast: we tell Java "I know what I'm doing"
        System.out.println("tiny = " + tiny); // prints -126 because bytes wrap around
        //Overflow in math
        int a = 2_000_000_000;
        int b =   200_000_000;
        int c = a + b;
        System.out.println(c); // prints -2094967296 -- it overflowed and became negative
    }
}
