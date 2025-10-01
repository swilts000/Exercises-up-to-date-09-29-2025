package Mini_Programs.scr;

import java.util.Scanner;

public class Mini_Program_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next(); // Reads one word

        System.out.println("Hello, " + name + "! Welcome!");
    }
}
