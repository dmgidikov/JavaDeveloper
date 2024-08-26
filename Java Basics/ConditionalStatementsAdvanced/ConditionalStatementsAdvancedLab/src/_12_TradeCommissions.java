import java.util.Scanner;

public class _12_TradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double commissionPercent = 0;
        boolean isThereError = false;

        if (sells < 0) {
            System.out.println("error");
        } else {
            switch (town) {
                case "Sofia" -> {
                    if (sells >= 0 && sells < 500) {
                        commissionPercent = 5;
                    } else if (sells > 500 && sells <= 1000) {
                        commissionPercent = 7;
                    } else if (sells > 1000 && sells <= 10000) {
                        commissionPercent = 8;
                    } else if (sells > 10000) {
                        commissionPercent = 12;
                    } else
                        isThereError = true;
                }
                case "Varna" -> {
                    if (sells >= 0 && sells <= 500) {
                        commissionPercent = 4.5;
                    } else if (sells > 500 && sells <= 1000) {
                        commissionPercent = 7.5;
                    } else if (sells > 1000 && sells <= 10000) {
                        commissionPercent = 10;
                    } else if (sells > 10000) {
                        commissionPercent = 13;
                    } else
                        isThereError = true;
                }
                case "Plovdiv" -> {
                    if (sells >= 0 && sells <= 500) {
                        commissionPercent = 5.5;
                    } else if (sells > 500 && sells <= 1000) {
                        commissionPercent = 8;
                    } else if (sells > 1000 && sells <= 10000) {
                        commissionPercent = 12;
                    } else if (sells > 10000) {
                        commissionPercent = 14.5;
                    } else
                        isThereError = true;
                }
                default -> isThereError = true;
            }

            if (isThereError)
                System.out.println("error");
            else {
                double result = (sells * commissionPercent) / 100;
                System.out.printf("%.2f", result);
            }
        }
    }
}


