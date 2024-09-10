import java.util.Scanner;

public class _8_PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        PrintPanlindromNum(number);
    }

    private static void PrintPanlindromNum(int number) {

        String numberAsString = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        sb.append(numberAsString);
        sb.reverse();
        String reverseNumAsString = sb.toString();
        int reverseNum = Integer.parseInt(reverseNumAsString);

        if (number == reverseNum){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
