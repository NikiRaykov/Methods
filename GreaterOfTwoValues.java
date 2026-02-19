import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfValue = scanner.nextLine();

        if (typeOfValue.equals("int")) {
            int valueOne = Integer.parseInt(scanner.nextLine());
            int valueTwo = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(valueOne, valueTwo));
        } else if (typeOfValue.equals("char")) {
            char character1 = scanner.next().charAt(0);
            char character2 = scanner.next().charAt(0);
            System.out.println(getMax(character1, character2));
        } else if (typeOfValue.equals("string")) {
            String stringOne = scanner.nextLine();
            String stringTwo = scanner.nextLine();
            System.out.println(getMax(stringOne, stringTwo));
        }
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static char getMax(char a, char b) {
        return (char) Math.max(a, b);
    }

    public static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }

        return b;
    }
}
