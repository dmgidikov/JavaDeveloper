import java.util.Scanner;

public class _5_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();

        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (product){
            case "coffee": price = 1.5; break;
            case "water": price = 1; break;
            case "coke": price = 1.4; break;
            case "snacks": price = 2; break;
        }

        PrintPrice(quantity, price);
    }

    private static void PrintPrice(int quantity, double price) {
        double result = quantity * price;
        System.out.printf("%.2f", result);
    }
}
