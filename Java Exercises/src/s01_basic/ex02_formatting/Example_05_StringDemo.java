package s01_basic.ex02_formatting;

public class Example_05_StringDemo {
    public static void main(String[] args) {
        String message = "Java is cool";                           // store a string
        System.out.printf("Message: %s%n", message);              // print using %s

        // Extra: show another string
        String language = "Python is fun";
        System.out.printf("Another message: %n%s", language);
    }
}
