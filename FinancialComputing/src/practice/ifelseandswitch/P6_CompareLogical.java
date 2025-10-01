package practice.ifelseandswitch;

public class P6_CompareLogical {
    public static void main(String[] args) {
        int x = 10, y = 20, age = 15;
        boolean hasPermission = false;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y && x > 5: " + (x < y && x > 5));
        System.out.println("x < 0 || y > 15: " + (x < 0 || y > 15));
        System.out.println("!(x > y): " + !(x > y));
        System.out.println("canPlay " + (age >= 8 && hasPermission));
    }
}
