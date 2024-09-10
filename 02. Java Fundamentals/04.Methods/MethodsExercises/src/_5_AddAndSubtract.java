import java.util.Scanner;

public class _5_AddAndSubtract {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = GetSum(firstNumber, secondNumber);
        Subtract(result, thirdNumber);
    }

    private static void Subtract(int result, int thirdNumber) {
        System.out.println(result - thirdNumber);
    }

    private static int GetSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}