import java.util.Scanner;

public class _1_DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = new String[]
                {
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday",
                };

        int input = Integer.parseInt(scanner.nextLine()) - 1;

        if (input >= 0 && input <= 6){
            System.out.println(daysOfWeek[input]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
