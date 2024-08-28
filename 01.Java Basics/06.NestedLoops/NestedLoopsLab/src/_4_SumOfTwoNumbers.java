import java.util.Scanner;

public class _4_SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int magicCombinations = 0;
        int totalCombinations = 0;
        int firstCombibationX = 0;
        int firstCombibationY = 0;

        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++) {

               if (i + j == magicNum){
                   magicCombinations++;

                   if (firstCombibationX == 0 && firstCombibationY == 0){
                       firstCombibationX = i;
                       firstCombibationY = j;
                   }
               }

               totalCombinations++;
            }
        }

        if (magicCombinations > 0){
            System.out.printf("Combination N:%d (%d + %d = %d)", totalCombinations, firstCombibationX, firstCombibationY, magicNum);
        }else {
            System.out.printf("%d combinations - ", totalCombinations);
            System.out.printf("neither equals %d", magicNum);
        }
    }
}
