import java.util.Scanner;

public class _5_GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String greeting = "Hello, ";

        String name = scanner.nextLine();

        String sign = "!";

        String result =greeting.concat(name).concat(sign);

        System.out.println(result);
    }
}
