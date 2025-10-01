package If_Statements.ExQuiz;

public class Ex02_EvenOdd {
    public static void main(String[] args) {
        int number = 2;
        if (number == 0) {
            System.out.println(number + " number is zero.");
        } else if (number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else  {
            System.out.println(number + " number is an odd number.");
        }
    }
}
