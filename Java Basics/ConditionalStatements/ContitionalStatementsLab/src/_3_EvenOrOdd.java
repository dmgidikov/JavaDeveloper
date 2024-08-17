import java.util.Scanner;

public class _3_EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String result = num % 2 == 0 ? "Even" : "Odd";

        System.out.println(result);
    }
}
