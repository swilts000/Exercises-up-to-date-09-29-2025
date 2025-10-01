package Mini_Programs.scr;

import java.util.Scanner;

public class Mini_Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double area = width * height;

        System.out.println("The area of the rectangle is " + area);
    }
}
