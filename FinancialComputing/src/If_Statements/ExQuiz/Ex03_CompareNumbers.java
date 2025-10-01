package If_Statements.ExQuiz;

public class Ex03_CompareNumbers {
    public static void main(String[] args) {
        int numberOne = 2;
        int numberTwo = 4;
        if (numberOne == numberTwo){
            System.out.println("Numbers are equal");
        } else if (numberOne > numberTwo) {
            System.out.println("NumberOne is greater than NumberTwo");
        } else if (numberOne < numberTwo) {
            System.out.println("NumberOne is less than NumberTwo");
        }
    }
}
