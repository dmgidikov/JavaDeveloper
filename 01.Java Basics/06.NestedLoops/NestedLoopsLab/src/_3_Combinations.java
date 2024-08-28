import java.util.Scanner;

public class _3_Combinations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rotations = Integer.parseInt(scanner.nextLine());
        int num = rotations;
        int counter = 0;

        for (int i = 0; i <= rotations; i++) {

            for (int j = 0; j <= rotations; j++) {

                for (int k = 0; k <= rotations; k++) {

                    if(i + j + k == num){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
