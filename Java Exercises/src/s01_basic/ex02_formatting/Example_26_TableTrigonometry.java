package s01_basic.ex02_formatting;

public class Example_26_TableTrigonometry {
    public static void main(String[] args) {
        int degrees = 20;
        double radians = Math.toRadians(degrees);
        System.out.printf(" | %-10s | %-10s | %-10s | %-10s | %-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        System.out.printf(" | %-10d | %-10.4f | %-10.4f | %-10.4f | %-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        degrees = degrees + 30;
        radians = Math.toRadians(degrees);
        System.out.printf(" | %-10d | %-10.4f | %-10.4f | %-10.4f | %-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
