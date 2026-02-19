import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(numberOfPower(number, power));
    }

    public static double numberOfPower(double n, int p) {
        return Math.pow(n, p);
    }
}
