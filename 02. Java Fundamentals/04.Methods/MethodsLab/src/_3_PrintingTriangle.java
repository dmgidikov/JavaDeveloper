import java.util.Scanner;

public class _3_PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        PrintTriangle(number);
    }

    public  static  void PrintTriangle(int num){

        for (int i = 0; i < num; i++) {
            System.out.print(1 + " ");

            for (int j = 1; j < i + 1; j++) {
                System.out.print((j + 1) + " ");
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            System.out.print(1 + " ");

            for (int j = 1; j < i; j++) {
                System.out.print((j + 1) + " ");
            }

            System.out.println();
        }
    }
}
