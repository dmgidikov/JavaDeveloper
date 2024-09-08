import java.util.Arrays;
import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraylenght = Integer.parseInt(scanner.nextLine());

        int[] array = new int[arraylenght];

        for (int i = 0; i < arraylenght; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(array[i] + " ");
        }

        System.out.println(Arrays.stream(array).sum());
    }
}
