import java.util.Scanner;

public class _9_FruitOrVegetable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = switch (input) {
            case "banana", "apple",  "kiwi", "cherry", "lemon" , "grapes" -> "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> "vegetable";
            default -> "unknown";
        };

        System.out.println(output);
    }
}
