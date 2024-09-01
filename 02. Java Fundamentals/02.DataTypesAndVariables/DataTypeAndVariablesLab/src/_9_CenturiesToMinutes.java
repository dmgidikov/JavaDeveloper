import java.util.Scanner;

public class _9_CenturiesToMinutes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int centuries = Integer.parseInt(sc.nextLine());

        int yearsInCenturies = centuries * 100;
        int daysInCenturie = centuries * 26524;
        int hoursInCenturies = centuries * 876581;
        int minutesInCenturies = centuries * 52594877;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, yearsInCenturies, daysInCenturie,
                hoursInCenturies, minutesInCenturies);
    }
}
