import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class _7_NxNMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rotations = Integer.parseInt(scanner.nextLine());

        PrintMatrix(rotations);

    }

    private static void PrintMatrix(int rotations) {

        int rotationsCopy = rotations;

        while (rotationsCopy > 0){

            for (int i = 0; i < rotations; i++) {

                System.out.print(rotations + " ");
            }

            System.out.println();

            rotationsCopy--;
        }
    }
}
