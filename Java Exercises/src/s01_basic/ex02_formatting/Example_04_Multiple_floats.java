package s01_basic.ex02_formatting;

public class Example_04_Multiple_floats {
    public static void main(String[] args) {
        //example 1 Simple %f usage
        float price = 45.50f;  // f at the end means it's a float
        System.out.printf("The price is %f%n", price);
        //example 2 Limiting decimal place
        double pi = 3.1415926535;
        System.out.printf("Pi to 2 decimal places: %n %.2f", pi);
        //example  Multiple floats
        float price1 = 19.99f;
        float price2 = 29.49f;
        System.out.printf("Price1: %f, %n Price2: %f", price1, price2);
    }
}