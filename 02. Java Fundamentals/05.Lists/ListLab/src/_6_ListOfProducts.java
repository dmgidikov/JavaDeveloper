import java.util.*;

public class _6_ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<String>();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "." + products.get(i));
        }
    }
}
