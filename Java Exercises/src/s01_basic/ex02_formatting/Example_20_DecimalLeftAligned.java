package s01_basic.ex02_formatting;

public class Example_20_DecimalLeftAligned {
    public static void main(String[] args) {
        double salary = 4567.5;
        System.out.printf("Salary: %-10.2fEND%n", salary);
    }
}
