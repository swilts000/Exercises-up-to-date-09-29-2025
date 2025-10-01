package practice.ifelseandswitch;

import java.util.Scanner;

public class P2_ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number (20-27): ");
        int choice = sc.nextInt();
        System.out.println("You typed: " + choice);
        String results = (choice == 22) ? "Choice is 22" : "Choice is NOT 22";
        System.out.println(results);
        sc.close();
    }
}
