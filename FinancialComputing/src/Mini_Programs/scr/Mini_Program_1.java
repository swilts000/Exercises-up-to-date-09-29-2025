package Mini_Programs.scr;

import java.util.Scanner;

public class Mini_Program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average is " + average);
    }
}
