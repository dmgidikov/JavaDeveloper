import java.util.Scanner;

public class _6_TriangleOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {

            System.out.printf(i + " ");
            for (int j = 1; j < i ; j++) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }
}
