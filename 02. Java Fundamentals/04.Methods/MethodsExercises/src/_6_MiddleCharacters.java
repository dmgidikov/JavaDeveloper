import java.util.Scanner;

public class _6_MiddleCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        PrintMiddleCharactersFromText(text);
    }

    private static void PrintMiddleCharactersFromText(String text) {

        String middleChar = "";

        if (text.length() % 2 == 0) {

            middleChar += text.charAt(text.length() / 2 - 1);
            middleChar += text.charAt(text.length() / 2);
        } else {
            middleChar += text.charAt(text.length() / 2);
        }

        System.out.println(middleChar);
    }
}