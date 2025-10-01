package practice.ifelseandswitch;

public class P8_Ternary {
    public static void main(String[] args) {
        int age = 9;
        String canVote = (age >= 18) ? "You can vote" : "Too young to vote";
        System.out.println(canVote);

        int marks = 85;
        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : "C or lower";
        boolean evenOrOdd = (marks % 2 == 0) ? true : false;
        System.out.println("Grade: " + grade);
        System.out.println("Is It Even?: " + evenOrOdd);
    }
}
