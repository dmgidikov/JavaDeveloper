import java.util.Scanner;

public class _1_Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double ticketPrice = 0;

        if (projection.equals("Premiere")){
            ticketPrice = 12;
        }else if(projection.equals("Normal")){
            ticketPrice = 7.5;
        }else if(projection.equals("Discount")){
            ticketPrice = 5;
        }

        double income = totalSeats * ticketPrice;
        System.out.printf("%.2f leva", income);
    }
}
