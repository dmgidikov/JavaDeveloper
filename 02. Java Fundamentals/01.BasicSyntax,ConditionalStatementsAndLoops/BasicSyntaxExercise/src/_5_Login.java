import java.util.Scanner;

public class _5_Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            char symbol = userName.charAt(i);
            password+=symbol;
        }

        System.out.println(password);
    }
}
