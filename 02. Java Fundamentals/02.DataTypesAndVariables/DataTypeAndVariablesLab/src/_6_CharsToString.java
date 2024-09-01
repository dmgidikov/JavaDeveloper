import java.util.Scanner;

public class _6_CharsToString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();

        sb.append(a).append(b).append(c);

        System.out.println(sb);
    }
}
