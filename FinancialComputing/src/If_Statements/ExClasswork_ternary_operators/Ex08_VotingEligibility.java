package If_Statements.ExClasswork_ternary_operators;

public class Ex08_VotingEligibility {
    public static void main(String[] args) {
        int age = 17;

        // 1. Ternary checks if age >= 18
        // 1a. True → "Eligible to vote"
        // 1b. False → "Not eligible to vote"
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(result);
    }
}
