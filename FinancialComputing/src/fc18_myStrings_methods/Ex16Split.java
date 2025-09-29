package fc18_myStrings_methods;

import java.util.Arrays;

public class Ex16Split {
    public static void main(String[] args) {
        // 1. Declare a CSV string
        String csv = "red,green,blue";

        // 2. Split the string by comma into an array
        String[] parts = csv.split(",");

        // 3. Print the array using Arrays.toString()
        System.out.println(Arrays.toString(parts)); // Output: [red, green, blue]

        // 4. Split with a limit (maximum number of elements)
        String[] twoParts = csv.split(",", 2);
        System.out.println(Arrays.toString(twoParts)); // Output: [red, green,blue]
    }
}
