import java.util.Scanner;

public class _9_SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i < input * 2; i++) {
            if (i % 2 != 0){
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum: " + sum);
    }
}
