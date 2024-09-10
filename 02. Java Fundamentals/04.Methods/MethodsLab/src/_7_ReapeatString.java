import java.util.Scanner;

public class _7_ReapeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeatingTimes = Integer.parseInt(scanner.nextLine());

        String newText = GetNewText(text, repeatingTimes);
        System.out.println(newText);
    }

    private static String GetNewText(String text, int rotations) {

        String newText = "";

        for (int i = 0; i < rotations; i++) {
            newText += text;
        }

        return newText;
    }
}