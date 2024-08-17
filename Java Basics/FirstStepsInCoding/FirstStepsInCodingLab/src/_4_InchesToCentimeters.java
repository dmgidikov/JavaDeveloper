import java.util.Scanner;

public class _4_InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double inputAsCm = input * 2.54;

        System.out.println(inputAsCm);
    }
}
