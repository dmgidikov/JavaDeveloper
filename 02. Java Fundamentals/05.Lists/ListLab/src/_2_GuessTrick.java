import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_GuessTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> numbers = new ArrayList<>();

        for (int i : input) {
            numbers.add(i);
        }

        for (int i = 0; i < input.length / 2; i++) {
            int number = numbers.get(i) + numbers.getLast();
            numbers.set(i, number);
            numbers.removeLast();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}