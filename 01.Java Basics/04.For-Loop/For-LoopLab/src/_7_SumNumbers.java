import java.util.Scanner;

public class _7_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < num; i++) {

            int temp = Integer.parseInt(scanner.nextLine());

            sum += temp;
        }

        System.out.println(sum);
    }
}
