package If_Statements.ExClasswork_ternary_operators;

public class Ex10_TemperatureCheck {
    public static void main(String[] args) {
        int temp = 30;

        // 1. Nested ternary checks temperature ranges
        // 1a. temp > 35 → "It's hot"
        // 1b. temp >= 25 → "It's warm"
        // 1c. Else → "It's cold"
        String result = (temp > 35) ? "It's hot" : (temp >= 25 ? "It's warm" : "It's cold");

        System.out.println(result);
    }
}
