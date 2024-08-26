import java.util.Scanner;

public class _10_InvalidNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double randomNumber = Double.parseDouble(scanner.nextLine());

        if(randomNumber != 0) {
            if (randomNumber < 100 || randomNumber > 200) {
                System.out.println("invalid");
            }
        }
    }
}
