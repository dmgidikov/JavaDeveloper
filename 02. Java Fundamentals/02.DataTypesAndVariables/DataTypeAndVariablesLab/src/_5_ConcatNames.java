import java.util.Scanner;

public class _5_ConcatNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String sign = sc.nextLine();

        System.out.printf("%s%s%s", firstName, sign, secondName);
    }
}
