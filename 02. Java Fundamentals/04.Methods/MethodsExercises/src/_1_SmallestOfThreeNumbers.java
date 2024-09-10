import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int smallestNumber = GetSmallestNumber(first, second, third);
        System.out.println(smallestNumber);
    }

    private static int GetSmallestNumber(int first, int second, int third){

        int result = Math.min(first, Math.min(second, third));

        return result;
    }
}