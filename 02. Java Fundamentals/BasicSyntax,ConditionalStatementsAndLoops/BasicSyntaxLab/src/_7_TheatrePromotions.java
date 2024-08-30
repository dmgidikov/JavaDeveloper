import java.util.Scanner;

public class _7_TheatrePromotions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        boolean IsThereError = false;

        if (age >= 0 && age < 18) {
            if (dayType.equals("weekday")){
                ticketPrice = 12;
            }else if (dayType.equals("weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("holiday")){
                ticketPrice = 5;
            }
        }else if (age >= 18 && age < 64) {
            if (dayType.equals("weekday")){
                ticketPrice = 18;
            }else if (dayType.equals("weekend")){
                ticketPrice = 20;
            }else if (dayType.equals("holiday")){
                ticketPrice = 12;
            }
        }else if(age >= 64 && age <= 122){
            if (dayType.equals("weekday")){
                ticketPrice = 12;
            }else if (dayType.equals("weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("holiday")){
                ticketPrice = 10;
            }
        }else{
            IsThereError = true;
        }

        if (IsThereError){
            System.out.println("Error!");
        }else {
            System.out.println(ticketPrice + "$");
        }
    }
}
