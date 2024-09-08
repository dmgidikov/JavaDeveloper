import java.util.Arrays;
import java.util.Scanner;

public class _4_ArrayRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int roations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < roations; i++) {

            int firstNumInArray =  nums[0];

            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }

            nums[nums.length - 1] = firstNumInArray;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
