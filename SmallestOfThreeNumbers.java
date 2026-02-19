import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        System.out.println(findSmallestNumber(numberOne, numberTwo, numberThree));
    }

    public static int findSmallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
