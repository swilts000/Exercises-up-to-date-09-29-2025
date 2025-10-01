package practice.ifelseandswitch;

public class P5_MathAdvanced {
    public static void main(String[] args) {
        double n = 25.0;
        System.out.println("sqrt(25) = " + Math.sqrt(n));
        System.out.println("2^8 = " + Math.pow(2, 8));
        System.out.println("sin(45°) = " + Math.sin(Math.toRadians(45)));
        System.out.println("cos(60°) = " + Math.cos(Math.toRadians(60)));
        System.out.println("max(10,20) = " + Math.max(10, 20));
        System.out.println("Random = " + (Math.random() * 10) + 1);
    }
}
