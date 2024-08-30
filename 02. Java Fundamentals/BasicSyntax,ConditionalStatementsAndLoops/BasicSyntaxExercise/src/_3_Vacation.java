import java.util.Scanner;

public class _3_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String ticketType = scanner.nextLine();
        String day = scanner.nextLine();

        double ticketPrice = 0;

        if (day.equals("Friday")){
           if(ticketType.equals("Students")){
               ticketPrice = 8.45;
           }else if (ticketType.equals("Business")){
                ticketPrice = 10.9;
           }else if (ticketType.equals("Regular")){
               ticketPrice = 15;
           }
        }else if (day.equals("Saturday")){
            if(ticketType.equals("Students")){
                ticketPrice = 9.8;
            }else if (ticketType.equals("Business")){
                ticketPrice = 15.6;
            }else if (ticketType.equals("Regular")){
                ticketPrice = 20;
            }
        }else if (day.equals("Sunday")){
            if(ticketType.equals("Students")){
                ticketPrice = 10.46;
            }else if (ticketType.equals("Business")){
                ticketPrice = 16;
            }else if (ticketType.equals("Regular")){
                ticketPrice = 22.5;
            }
        }
        double result = ticketPrice * peopleNumber;

        if (peopleNumber >= 30 && ticketType.equals("Students")){
            result = result - (result * 0.15);
        }else if (peopleNumber >= 100 && ticketType.equals("Business")){
            result -= 10 * ticketPrice;
        }else if (peopleNumber >= 10 && peopleNumber <= 20 && ticketType.equals("Regular")){
            result = result - (result * 0.05);
        }

        System.out.println("Total price: " + result);
    }
}
