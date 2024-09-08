import java.util.Arrays;
import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[num];
        int[] secondArray = new int[num];

        for (int i = 0; i < num; i++) {

            int[] tempArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            if (i % 2 == 0){
                firstArray[i] = tempArray[0];
                secondArray[i] = tempArray[1];
            }else {
                secondArray[i] = tempArray[0];
                firstArray[i] = tempArray[1];
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
