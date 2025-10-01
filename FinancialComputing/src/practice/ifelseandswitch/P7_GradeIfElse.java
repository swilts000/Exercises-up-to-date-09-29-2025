package practice.ifelseandswitch;

public class P7_GradeIfElse {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        }else{
            System.out.println("Needs improvement");
        }
    }
}
