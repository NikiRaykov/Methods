import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplyEvenByOdds(number));
    }

    public static int multiplyEvenByOdds(int n) {
        int evenSum = getSumOfAllEvenNumbers(n);
        int oddSum = getSumOfAllOddNumbers(n);

        return evenSum * oddSum;
    }

    private static int getSumOfAllOddNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = Math.abs(n % 10);
            if (digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }

    private static int getSumOfAllEvenNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = Math.abs(n % 10);
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }
}
