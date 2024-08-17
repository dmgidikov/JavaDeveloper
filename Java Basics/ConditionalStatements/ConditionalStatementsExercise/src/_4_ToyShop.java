import java.util.Scanner;

public class _4_ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());

        int totalPuzzles =  Integer.parseInt(scanner.nextLine());
        int totalDolls =  Integer.parseInt(scanner.nextLine());
        int totalBears = Integer.parseInt(scanner.nextLine());
        int totalMinions = Integer.parseInt(scanner.nextLine());
        int totalLorries = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.6 * totalPuzzles;
        int dollPrice = 3 * totalDolls;
        double bearsPrice = 4.1 * totalBears;
        double minionPrice = 8.2 * totalMinions;
        int loryPrice = 2 * totalLorries;

        int totalToys = totalPuzzles + totalDolls + totalBears + totalMinions + totalLorries;
        double totalSum = puzzlePrice + dollPrice + bearsPrice + minionPrice + loryPrice;

        if (totalToys >= 50){

            totalSum -=totalSum * 0.25;
        }

        double finalSum = totalSum - (totalSum * 0.1);

        double result = Math.abs(finalSum - neededMoney);

        if (finalSum > neededMoney){
            System.out.printf("Yes! %.2f lv left.", result);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", result);
        }
    }
}
