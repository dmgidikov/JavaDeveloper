import java.util.Scanner;

public class _6_VowelsSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (temp == 'a') {
                sum += 1;
            } else if (temp == 'e') {
                sum += 2;
            } else if (temp == 'i') {
                sum += 3;
            } else if (temp == 'o') {
                sum += 4;
            } else if (temp == 'u') {
                sum += 5;
            }
        }

        System.out.println(sum);
    }
}
