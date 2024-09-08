import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int max = Arrays.stream(nums).max().getAsInt();
        int indexOfMaxElement = -1;

        for (int i = 0; i < nums.length; i++) {

            int curentElement = nums[i];

            if (curentElement == max){
                indexOfMaxElement = i;
                break;
            }
        }

        for (int i = indexOfMaxElement; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
