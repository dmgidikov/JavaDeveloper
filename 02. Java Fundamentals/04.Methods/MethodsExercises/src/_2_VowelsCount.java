import java.util.Scanner;

public class _2_VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        int vowelsNumber = GetVowelsNumberInWord(word);
        System.out.println(vowelsNumber);
    }

    private static int GetVowelsNumberInWord(String word) {

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            char symbol = word.charAt(i);

            if (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i' ||
                symbol == 'A' || symbol == 'O' || symbol == 'U' || symbol == 'E' || symbol == 'I'){
                sum++;
            }
        }

        return sum;
    }
}