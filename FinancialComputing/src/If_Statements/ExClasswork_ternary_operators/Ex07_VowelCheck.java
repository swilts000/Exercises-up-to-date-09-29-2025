package If_Statements.ExClasswork_ternary_operators;

public class Ex07_VowelCheck {
    public static void main(String[] args) {
        char ch = 'a';

        // 1. Ternary checks if character is a vowel using OR (||)
        // 1a. True → "Vowel"
        // 1b. False → "Not a vowel"
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Not a vowel";

        System.out.println(result);
    }
}
