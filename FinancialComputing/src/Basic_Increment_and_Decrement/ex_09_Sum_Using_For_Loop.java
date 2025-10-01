package Basic_Increment_and_Decrement;

public class ex_09_Sum_Using_For_Loop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) { // i++ moves to next number automatically
            sum += i; // add i to sum
        }
        System.out.println("Sum of 1 to 5: " + sum); // prints 15
    }
}
