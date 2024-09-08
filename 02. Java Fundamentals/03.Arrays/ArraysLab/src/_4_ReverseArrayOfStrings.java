import java.util.Arrays;
import java.util.Scanner;

public class _4_ReverseArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] someText = scanner.nextLine().split(" ");

        for (int i = 0; i < someText.length / 2; i++) {

            String leftSide = someText[i];
            String rightSide = someText[someText.length - i - 1];

            someText[i] = rightSide;
            someText[someText.length - i - 1] = leftSide;
        }

        System.out.println(String.join(" ", someText));
    }
}
