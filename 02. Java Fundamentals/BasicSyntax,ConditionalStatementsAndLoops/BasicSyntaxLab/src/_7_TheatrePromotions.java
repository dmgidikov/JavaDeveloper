import java.util.Scanner;

public class _7_TheatrePromotions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean IsThereError = false;

        if (age >= 0 && age < 18) {
            if (dayType.equals("Weekday")){
                ticketPrice = 12;
            }else if (dayType.equals("Weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("Holiday")){
                ticketPrice = 5;
            }
        }else if (age >= 18 && age < 64) {
            if (dayType.equals("Weekday")){
                ticketPrice = 18;
            }else if (dayType.equals("Weekend")){
                ticketPrice = 20;
            }else if (dayType.equals("Holiday")){
                ticketPrice = 12;
            }
        }else if(age >= 64 && age <= 122){
            if (dayType.equals("Weekday")){
                ticketPrice = 12;
            }else if (dayType.equals("Weekend")){
                ticketPrice = 15;
            }else if (dayType.equals("Holiday")){
                ticketPrice = 10;
            }
        }else{
            IsThereError = true;
        }

        if (IsThereError){
            System.out.println("Error!");
        }else {
            System.out.println(ticketPrice);
        }
    }
}
