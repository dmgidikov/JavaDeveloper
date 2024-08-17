import java.util.Scanner;

public class _4_VacationBookList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());

        int totalDaysToReadBook = pages / pagesPerHour;
        int totalHoursPerDay = totalDaysToReadBook / totalDays;

        System.out.println(totalHoursPerDay);

    }
}
