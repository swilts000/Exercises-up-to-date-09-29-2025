package If_Statements.ExQuiz;

public class Ex01_PositiveNegative {
    public static void main(String[] args) {
        float num = 0;
        if (num > 0){
            System.out.println("Positive number");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative number");
        }
    }
}
