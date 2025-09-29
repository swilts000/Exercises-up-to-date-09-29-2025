package s01_basic.ex02_formatting;

public class Example_01_Char {
    public static void main(String[] args) {
        char ch = 'a'; // create a char variable holding 'a'
        // Extra: show how a number maps to a character (65 -> 'A')
        char fromCode = (char)65;// cast integer 65 to a char (becomes 'A')
        //(char) gets the ascii numbered character instead of the declared variable
        System.out.printf("The letter is %c%n", ch);
        System.out.printf("Char for 65 is %c%n", fromCode);// prints: Char for 65 is A
    }
}
