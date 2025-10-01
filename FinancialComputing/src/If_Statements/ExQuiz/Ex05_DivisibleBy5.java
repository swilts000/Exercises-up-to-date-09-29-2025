package If_Statements.ExQuiz;

public class Ex05_DivisibleBy5 {
    public static void main(String[] args) {
        int number = 50;

        if (number % 5 == 0 && number % 10 == 0) {
            System.out.println(number + " is divisible by both 5 and 10.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 but not by 10.");
        } else if (number % 10 == 0) {
            System.out.println(number + " is divisible by 10 but not by 5.");
        } else {
            System.out.println(number + " is not divisible by either 5 or 10.");
        }
    }
}
