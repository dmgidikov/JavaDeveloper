import java.util.*;

public class _7_RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        ArrayList<Integer> numbers = new ArrayList<>(input);

        numbers.removeIf(number -> number < 0);

        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }

        }
    }
}
