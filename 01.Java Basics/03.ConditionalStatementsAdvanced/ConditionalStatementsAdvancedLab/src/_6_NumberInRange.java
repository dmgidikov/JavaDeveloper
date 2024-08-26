import java.util.Scanner;

public class _6_NumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double randomNumber = Double.parseDouble(scanner.nextLine());

        if (randomNumber >= -100 && randomNumber <= 100 && randomNumber != 0){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
