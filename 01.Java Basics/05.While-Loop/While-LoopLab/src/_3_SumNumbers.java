import java.util.Scanner;

public class _3_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberToBeat = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (true){

            int input = Integer.parseInt(scanner.nextLine());

            sum += input;

            if (sum >= numberToBeat) {
                System.out.println(sum);
                break;
            }
        }
    }
}
