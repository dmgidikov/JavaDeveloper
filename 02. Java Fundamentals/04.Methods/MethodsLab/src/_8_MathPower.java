import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.print(new DecimalFormat("0.####").format(mathPower(number, power)));
    }

    private static double mathPower(double number, double power) {
        return  Math.pow(number, power);
    }
}