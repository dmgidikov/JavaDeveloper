import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int currentNum = nums[i];

            if (currentNum % 2 == 0){
                sum += currentNum;
            }
        }

        System.out.println(sum);
    }
}
