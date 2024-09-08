import java.util.Arrays;
import java.util.Scanner;

public class _6_EqialSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int leftSum = 0;
        int rightSum = 0;

        boolean IsThereMatch = true;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                int current = nums[j];
                leftSum += current;
            }

            for (int k = i + 1; k < nums.length; k++) {
                int current = nums[k];
                rightSum += current;
            }

            if (leftSum == rightSum){
                IsThereMatch = true;
                index = i;
                break;
            }else {
               IsThereMatch = false;
            }

            leftSum = 0;
            rightSum = 0;
        }

        if (IsThereMatch){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
