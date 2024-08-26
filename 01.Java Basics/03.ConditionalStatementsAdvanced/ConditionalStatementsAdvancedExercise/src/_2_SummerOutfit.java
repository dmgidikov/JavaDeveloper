import java.util.Scanner;

public class _2_SummerOutfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (dayTime.equals("Morning")){
             if (degrees <= 18 && degrees > 10){
                 outfit += "Sweatshirt";
                 shoes += "Sneakers";
             }else if (degrees <= 24 && degrees > 18){
                 outfit += "Shirt";
                 shoes += "Moccasins";
             }else {
                 outfit += "T-Shirt";
                 shoes += "Sandals";
             }
        }else if(dayTime.equals("Afternoon")){
            if (degrees <= 18 && degrees > 10){
                outfit += "Shirt";
                shoes += "Moccasins";
            }else if (degrees <= 24 && degrees > 18){
                outfit += "T-Shirt";
                shoes += "Sandals";
            }else {
                outfit += "Swim Suit";
                shoes += "Barefoot";
            }
        }else if(dayTime.equals("Evening")){
            if (degrees <= 18 && degrees > 10){
                outfit += "Shirt";
                shoes += "Moccasins";
            }else if (degrees <= 24 && degrees > 18){
                outfit += "Shirt";
                shoes += "Moccasins";
            }else {
                outfit += "Shirt";
                shoes += "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
