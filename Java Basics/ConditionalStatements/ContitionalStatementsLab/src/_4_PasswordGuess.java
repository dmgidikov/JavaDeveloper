import java.util.Scanner;

public class _4_PasswordGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwordByDefautl = "s3cr3t!P@ssw0rd";

        String entryPassword = scanner.nextLine();

        if (passwordByDefautl.equals(entryPassword)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
