package If_Statements.ExQuiz;

public class Ex06_LargestNumber {
    public static void main(String[] args) {
        int num = 70, num2 = 36, num3 = 47;
        if (num == num2 || num == num3 || num2 == num3) {
            System.out.println("Matching Numbers Detected");
        } else if(num >= num2 && num >= num3){
            System.out.println(num + " is the largest number.");
        } else if (num2 >= num && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        }else{
            System.out.println(num3 + " is the largest number.");
        }
    }
}
