package s01_basic.ex03_variable;

public class Example_01_WholeNumbers {
    public static void main(String[] args) {
        byte smallJar = 100;           // fits in tiny jar (-128 to 127)
        int backpack = 20_000;         // good for many things
        long trunk = 9_876_543_210L;   // L at end means "this is a long"

        System.out.println(smallJar);
        System.out.println(backpack);
        System.out.println(trunk);
    }
}
