import java.util.Scanner;

public class _2_PoundsToDollars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dollars = Double.parseDouble(sc.nextLine());

        double pounds = (double)dollars * 1.36;

        System.out.printf("%.3f", pounds);
    }
}
