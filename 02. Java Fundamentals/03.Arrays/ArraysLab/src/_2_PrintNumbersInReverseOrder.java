import java.util.Scanner;

public class _2_PrintNumbersInReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[input];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
