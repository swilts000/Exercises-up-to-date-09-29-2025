package practice.ifelseandswitch;

import java.util.Scanner;

public class P9_FullSwitchMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick 20..28: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 20:
                System.out.println("Keywords: class, if, else, for, while");
                break;
            case 21:
                System.out.println("Arithmetic: 7+3=" + (7+3));
                break;
            case 22:
                System.out.println("Math Random(49)=" + (Math.random() * 10) + 1);
                break;
            case 23:
                System.out.println("Compare 5<8? " + (5 < 8));
                break;
            case 24:
                System.out.println("Logic true && false = " + (true && false));
                break;
            case 25:
                int m = 55;
                System.out.println((m>=50) ? "Pass" : "Fail");
                break;
            case 26:
                System.out.println((10 % 2 == 0) ? "Even" : "Odd");
                break;
            case 27:
                int day = 4;
                switch (day) {
                    case 1: System.out.println("Mon"); break;
                    case 4: System.out.println("Thu"); break;
                    default: System.out.println("Other day");
                }
            case 28:
                System.out.println("max(10,20) = " + Math.max(10, 20));
                break;
            default:
                System.out.println("Pick between 20 and 27");
        }
        sc.close();

    }
}
