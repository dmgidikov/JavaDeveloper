import java.util.Scanner;

public class _1_ConvertUSDtoBGN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputAsUsd = Double.parseDouble(scanner.nextLine());
        double inputAsBgn = inputAsUsd * 1.79549;

        System.out.println(inputAsBgn);

    }
}
