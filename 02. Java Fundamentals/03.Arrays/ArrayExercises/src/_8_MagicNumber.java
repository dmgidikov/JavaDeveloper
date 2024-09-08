import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int searchNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {

            int currentNumber = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {

                int nextNumber = numbers[j];

                if (currentNumber + nextNumber == searchNumber){
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
