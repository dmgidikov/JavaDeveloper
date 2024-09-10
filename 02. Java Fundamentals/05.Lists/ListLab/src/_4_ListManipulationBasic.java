import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _4_ListManipulationBasic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        ArrayList<Integer> nums = new ArrayList<Integer>(numbers);

        while (true) {

            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();

            if (input.get(0).equals("end")) {
                break;
            } else {

                int num = Integer.parseInt(input.get(1));

                switch (input.get(0)) {
                    case "Add":
                        nums.add(num);
                        break;
                    case "Remove":
                        nums.remove(num);
                        break;
                    case "RemoveAt":
                        nums.remove(num);
                        break;
                    case "Insert":
                        int indexToInsertAt = Integer.parseInt(input.get(2));
                        nums.add(indexToInsertAt, num);
                        break;
                }
            }
        }

        for (Integer number : nums) {
            System.out.print(number + " ");
        }
    }
}