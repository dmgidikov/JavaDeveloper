import java.util.Scanner;

public class _5_AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        while (true){

            String input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f%n", balance);
                break;
            }else {
                double money = Double.parseDouble(input);

                if (money >= 0) {
                    balance += money;
                    System.out.printf("Increase: %.2f%n", money);
                }else {
                    System.out.println("Invalid operation!");
                    System.out.printf("Total: %.2f%n", balance);
                    break;
                }
            }
        }
    }
}
