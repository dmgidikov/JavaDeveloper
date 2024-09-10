import java.util.Scanner;

public class _3_CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        PrintCharactersInRange(start, end);
    }

    private static void PrintCharactersInRange(char start, char end) {

        for (int i = (int)start + 1; i < (int)end; i++) {
            System.out.print((char)i + " ");
        }
    }
}