package Mini_Programs.scr;

import java.util.Scanner;

public class Mini_Program_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Reads integer

        int futureAge = age + 5;
        System.out.println("In 5 years, you will be " + futureAge + " years old.");
    }
}
