import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(number1, operator, number2));

    }

    public static double calculate(int a, String str, int b) {
        double result = 0.0;
        if (str.equals("/")) {
            return (double) a / b;
        } else if (str.equals("*")) {
            return (double) a * b;
        } else if (str.equals("+")) {
            return a + b;
        } else if (str.equals("-")) {
            return a - b;
        }

        return result;
    }
}
