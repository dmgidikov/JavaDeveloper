import java.util.Scanner;

public class _8_CinemaTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        int ticketPrice = switch (dayOfWeek) {
            case "Monday", "Tuesday", "Friday" -> 12;
            case "Wednesday", "Thursday" -> 14;
            case "Saturday", "Sunday" -> 16;
            default -> 0;
        };

        System.out.println(ticketPrice);
    }
}
