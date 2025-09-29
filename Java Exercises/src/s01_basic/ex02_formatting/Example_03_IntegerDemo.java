package s01_basic.ex02_formatting;

public class Example_03_IntegerDemo {
    public static void main(String[] args) {
        int apples = 200;                           // store 200 in an integer variable
        System.out.printf("I have %d apples%n", apples); // print using %d

        // Extra: print another integer
        int oranges = 50;
        System.out.printf("I also have %d oranges%n this is the next line", oranges);
    }
}
