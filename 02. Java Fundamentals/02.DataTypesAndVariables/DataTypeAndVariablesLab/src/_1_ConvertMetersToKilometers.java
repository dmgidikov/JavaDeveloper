import java.util.Scanner;

public class _1_ConvertMetersToKilometers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());

        double kilometers = (double)meters / 1000;

        System.out.printf("%.2f", kilometers);
    }
}
