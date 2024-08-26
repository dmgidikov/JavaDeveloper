import java.util.Scanner;

public class _11_FruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double productPrice = 0;
        boolean isThereError = false;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            switch (product) {
                case "banana" -> productPrice = 2.5;
                case "apple" -> productPrice = 1.2;
                case "orange" -> productPrice = 0.85;
                case "grapefruit" -> productPrice = 1.45;
                case "kiwi" -> productPrice = 2.7;
                case "pineapple" -> productPrice = 5.5;
                case "grapes" -> productPrice = 3.85;
                default -> isThereError = true;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (product) {
                case "banana" -> productPrice = 2.7;
                case "apple" -> productPrice = 1.25;
                case "orange" -> productPrice = 0.9;
                case "grapefruit" -> productPrice = 1.6;
                case "kiwi" -> productPrice = 3;
                case "pineapple" -> productPrice = 5.6;
                case "grapes" -> productPrice = 4.2;
                default -> isThereError = true;
            }
        } else isThereError = true;

        if (isThereError )
            System.out.println("error");
        else {
            double result = productPrice * quantity;
            System.out.printf("%.2f", result);
        }
    }
}
