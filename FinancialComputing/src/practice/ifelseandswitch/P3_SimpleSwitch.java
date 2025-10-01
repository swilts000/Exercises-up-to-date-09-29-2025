package practice.ifelseandswitch;

import java.util.Scanner;

public class P3_SimpleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick 21 for arithmetic demo: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 20:
                System.out.print("Pick 20 for arithmetic demo: ");
            case 21:
                System.out.println("Arithmetic demo coming up!");;
            default:
                System.out.println("Try 21 next time.");
        }
        sc.close();
    }
}
