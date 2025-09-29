package s01_basic.ex02_formatting;

public class Example_02_Boolean {
    // Program to show how to use %b to print Boolean values
    public static void main(String[] args) {
        boolean isRaining = true;
        System.out.printf("Is it raining? %b", isRaining);
        boolean hasUmbrella = false;
        System.out.printf("Do I have an umbrella? %b%n", hasUmbrella);
    }
}
