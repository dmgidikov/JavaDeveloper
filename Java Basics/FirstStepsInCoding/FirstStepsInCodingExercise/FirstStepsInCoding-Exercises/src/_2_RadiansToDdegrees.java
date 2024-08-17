import java.util.Scanner;

public class _2_RadiansToDdegrees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double result = input * 180 / Math.PI;

        System.out.println(result);
    }
}
