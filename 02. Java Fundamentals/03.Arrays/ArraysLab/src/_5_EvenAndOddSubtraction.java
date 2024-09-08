import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenAndOddSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < nums.length; i++) {

           int currentNum = nums[i];

           if (currentNum % 2 == 0){
               evenSum += currentNum;
           }else{
               oddSum += currentNum;
           }
        }

        System.out.println(evenSum - oddSum);
    }
}
