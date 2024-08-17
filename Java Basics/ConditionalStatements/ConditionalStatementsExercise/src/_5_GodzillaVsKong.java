import java.util.Scanner;

public class _5_GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistNum = Integer.parseInt(scanner.nextLine());
        double priceClothesPerOneStatist = Double.parseDouble(scanner.nextLine());

        budget -= (budget * 0.1);

        if (statistNum > 150){
            priceClothesPerOneStatist -= (priceClothesPerOneStatist * 0.1);
        }

        double totalCost = statistNum * priceClothesPerOneStatist;

        double result = Math.abs(budget - totalCost);

        if (totalCost > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more", result);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts film with %.2f leva left", result);
        }
    }
}
