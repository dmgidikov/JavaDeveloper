import java.util.Scanner;

public class _5_SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPens = Integer.parseInt(scanner.nextLine());
        int totalMarkers = Integer.parseInt(scanner.nextLine());
        int cleanerInLeters = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine()) / 100;

        double pensPrice = totalPens * 5.8;
        double markersPrice = totalMarkers * 7.2;
        double cleanerPrice = cleanerInLeters * 1.2;

        double totalCost = pensPrice + markersPrice + cleanerPrice;

        double totalCostAfterDiscount = totalCost - (totalCost * discount);

        System.out.println(totalCostAfterDiscount);



    }
}
