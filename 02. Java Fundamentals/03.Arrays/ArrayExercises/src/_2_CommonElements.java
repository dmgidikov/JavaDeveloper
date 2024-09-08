import java.util.Arrays;
import java.util.Scanner;

public class _2_CommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {

            String currentElement = secondArray[i];

            for (int j = 0; j < firstArray.length; j++) {

                String current = firstArray[j];

                if (currentElement.equals(current)){
                    System.out.print(current + " ");
                }
            }
        }
    }
}
