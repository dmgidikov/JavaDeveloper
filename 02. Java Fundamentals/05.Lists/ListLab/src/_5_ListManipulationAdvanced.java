import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _5_ListManipulationAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        ArrayList<Integer> nums = new ArrayList<>(numbers);

        while (true) {

            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();

            if (input.get(0).equals("end")) {
                break;
            } else {

                switch (input.get(0)) {
                    case "Contains":
                        CheckForNumber(input, nums);
                        break;
                    case "Print":
                        String oddOrEven = input.get(1);
                        PrintOddOrEvenNumbers(oddOrEven, nums);
                        break;
                    case "Get":
                        int result = nums.stream().mapToInt(a -> a).sum();
                        System.out.println(result);
                        break;
                    case "Filter":
                        String filterSign = input.get(1);
                        int filterNumber = Integer.parseInt(input.get(2));

                        PrintFilterNumbers(filterSign, nums, filterNumber);

                }
            }
        }
    }

    private static void PrintFilterNumbers(String filterSign, ArrayList<Integer> nums, int filterNumber) {
        switch (filterSign) {
            case ">":
                for (Integer num : nums) {
                    if (num > filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (Integer num : nums) {
                    if (num >= filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (Integer num : nums) {
                    if (num < filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer num : nums) {
                    if (num <= filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    private static void PrintOddOrEvenNumbers(String oddOrEven, ArrayList<Integer> nums) {
        if (oddOrEven.equals("even")){
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }else {
            for (Integer num : nums) {
                if (num % 2 == 1) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    private static void CheckForNumber(List<String> input, ArrayList<Integer> nums) {
        int number = Integer.parseInt(input.get(1));
        boolean containsNumber = nums.contains(number);
        if (containsNumber) {
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }
    }
}