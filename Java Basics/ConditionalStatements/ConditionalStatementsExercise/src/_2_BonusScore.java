import java.util.Scanner;

public class _2_BonusScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (startingPoints > 1000){
            bonusPoints = startingPoints * 0.1;
        } else if(startingPoints <= 1000 && startingPoints > 100){
            bonusPoints = startingPoints * 0.2;
        } else{
            bonusPoints = 5;
        }

        if (startingPoints % 2 == 0){
            bonusPoints += 1;
        }

        if (startingPoints % 10 == 5){
            bonusPoints+=2;
        }

        double totalPoints = startingPoints + bonusPoints;

        System.out.println(bonusPoints);
        System.out.println(totalPoints);
    }
}
