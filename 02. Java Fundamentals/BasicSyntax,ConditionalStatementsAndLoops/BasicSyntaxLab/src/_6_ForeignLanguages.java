import java.util.Scanner;

public class _6_ForeignLanguages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.next();

        String result;

        switch (country) {
            case "USA":
            case "England":
                result = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                result = "Spanish";
                break;
            default:
                result = "unknown";
                break;
        }

        System.out.println(result);
    }
}
