package s01_basic.ex03_variable;

public class Example_08_VariableTypesExample {
    public static void main(String[] args) {
        // ✅ Correct assignments (no errors)

        byte b = 120;   // size: 8 bits (-128 to 127)
        int i = 20000;  // size: 32 bits
        long l = 9000000000L; // size: 64 bits (L at the end is required)
        float f = 3.14f; // size: 32 bits (f at the end is required)
        double d = 3.14159265359; // size: 64 bits
        char c = 'A';   // size: 16 bits (Unicode character)
        boolean flag = true; // size: JVM-dependent (usually 1 bit in theory, 1 byte in practice)

        // --------------❌ Examples with errors (uncomment one at a time to see the compiler error)--------------------

        //b = (byte) 200; // ERROR: 200 is too large for byte (-128 to 127)
        //i = (int) 9000000000; // ERROR: int max is 2,147,483,647, use long instead
        //float fError = 3.14; // ERROR: without 'f', 3.14 is treated as double
        // char cError = "A"; // ERROR: char must be single quotes, not string
        // boolean flagError = 1; // ERROR: boolean can only be true/false, not 1/0
        // Print values and types

        System.out.println("byte value: " + b);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + flag);



    }
}
