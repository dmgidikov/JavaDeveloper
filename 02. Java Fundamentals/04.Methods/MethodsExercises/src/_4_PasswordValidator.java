import java.util.Scanner;

public class _4_PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

       if (CheckPasswordLength(password) && CheckPasswordSymbols(password) && CheckPasswordForTwoDigits(password)){
           System.out.println("Password is valid");
       }else{
           if (CheckPasswordLength(password) == false){
               System.out.println("Password must be between 6 and 10 characters");
           }

           if (CheckPasswordSymbols(password) == false){
               System.out.println("Password must consist only of letters and digits");
           }

           if (CheckPasswordForTwoDigits(password) == false){
               System.out.println("Password must have at least 2 digits");
           }
       }
    }

    private static boolean CheckPasswordForTwoDigits(String password) {

        int sum = 0;

        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);

            if ((int) symbol >= 48 && (int) symbol <= 58) {
                sum++;
            }
        }

        return  sum >= 2 ? true : false;
    }

    private static boolean CheckPasswordSymbols(String password) {

        boolean Check = true;

        for (int i = 0; i < password.length(); i++) {

            char symbol = password.charAt(i);

            if (!((int) symbol >= 48 && (int) symbol <= 58 || (int) symbol >= 65 && (int) symbol <= 90
                || (int) symbol >= 97 && (int) symbol <= 122)){
                Check = false;
                break;
            }
        }

        return Check;
    }

    private static boolean CheckPasswordLength(String password) {
        return password.length() >= 6 && password.length() <= 10 ? true : false;
    }
}