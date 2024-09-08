import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean areEqual = true;

        if (firstArray.length == secondArray.length) {

            for (int i = 0; i < firstArray.length; i++) {

                int firstNum = firstArray[i];
                int secondNum = secondArray[i];

                if (firstNum != secondNum){
                    areEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }
        }

        if (areEqual)
            System.out.println("Arrays are identical. Sum: " + Arrays.stream(firstArray).sum());
    }
}
