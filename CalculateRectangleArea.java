import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());

        double length = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(width, length);

        System.out.println(area);
    }

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }
}
