import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1_ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).toList());

        for (int i = 0; i < numbers.size() - 1; i++) {

            double first = numbers.get(i);
            double second = numbers.get(i + 1);

            if (first == second) {
                first += second;
                numbers.set(i, first);
                numbers.remove(i + 1);
                i = -1;
            }
        }

        String ouput = " ";

        for (Double number : numbers) {
            ouput += (new DecimalFormat("0.#").format(number));
        }

        String abc = "abc";
        String result = abc.repeat(5);

        System.out.println(ouput);
    }
}