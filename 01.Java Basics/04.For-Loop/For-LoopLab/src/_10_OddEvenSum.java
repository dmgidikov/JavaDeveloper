import java.util.Scanner;

public class _10_OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num; i++) {

            int temp = Integer.parseInt(scanner.nextLine());

            if (i % 2 ==0){
                evenSum += temp;
            } else  {
                oddSum += temp;
            }
        }

        if (oddSum == evenSum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
