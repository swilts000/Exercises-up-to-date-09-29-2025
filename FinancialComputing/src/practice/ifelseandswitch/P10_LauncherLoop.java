package practice.ifelseandswitch;

import java.util.Scanner;

public class P10_LauncherLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Enter 20-27 to run, or 0 to quit:");
            if (!sc.hasNextInt()) {            // input validation
                System.out.println("Please type a number!");
                sc.next(); // consume invalid token
                continue;
            }
            choice = sc.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 20: System.out.println("Keywords demo"); break;
                case 21: System.out.println("Arithmetic demo"); break;
                case 22: System.out.println("Math demo"); break;
                case 23: System.out.println("Comparison demo"); break;
                case 24: System.out.println("Logical demo"); break;
                case 25: System.out.println("If demo"); break;
                case 26: System.out.println("Ternary demo"); break;
                case 27: System.out.println("Switch demo"); break;
                default: System.out.println("Choose between 20-27");
            }
        }
        sc.close();
        System.out.println("Bye! Great job practicing.");

    }
}
