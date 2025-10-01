package If_Statements.ExQuiz;

public class Ex08_VotingEligibility {
    public static void main(String[] args) {
        int age = -4;
        if (age >= 0) {
            System.out.println("You are not born yet dummy");
        }else if (age < 18) {
            System.out.println("You are not eligible to vote!");
        }else if (age >= 18 && age <= 80) {
            System.out.println("You are eligible to vote!");
        }
    }
}
