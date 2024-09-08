import java.util.Arrays;
import java.util.Scanner;

public class _7_MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        int counter = 0;
        int magicNumber = 0;

        for (int i = 0; i < numbers. length - 1; i++) {

            int currentNumber = numbers[i];

            int tempCounter = 0;
            int tempMagicNumber = 0;

            for (int j = i + 1; j < numbers.length; j++) {

                int nextNumber = numbers[j];

                if (currentNumber == nextNumber){
                    tempCounter ++;
                    tempMagicNumber = currentNumber;

                    if (tempCounter > counter) {
                        counter = tempCounter;
                        magicNumber = tempMagicNumber;
                    }

                }else {
                    break;
                }
            }
        }

        for (int i = 0; i < counter + 1; i++) {
            System.out.print(magicNumber + " ");
        }
    }
}
