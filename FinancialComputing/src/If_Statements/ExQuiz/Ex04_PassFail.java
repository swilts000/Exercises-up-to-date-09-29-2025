package If_Statements.ExQuiz;

public class Ex04_PassFail {
    public static void main(String[] args) {
        int Grade = 45;
        if (Grade<=100 && Grade>=90){
            System.out.println("You passed with an excellent");
        }else if (Grade<=89 && Grade>=70){
            System.out.println("You passed");
        }else if (Grade<=69 && Grade>=50){
            System.out.println("Needs Improvement");
        }else if (Grade<50){
            System.out.println("GOT DAMN");
        }
    }
}
