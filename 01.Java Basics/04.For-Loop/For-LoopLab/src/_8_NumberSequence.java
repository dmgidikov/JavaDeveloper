import java.util.Scanner;

public class _8_NumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {

            int temp = Integer.parseInt(scanner.nextLine());

            if (temp > maxNum){
                maxNum = temp;
            }

            if (temp < minNum){
                minNum = temp;
            }
        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
