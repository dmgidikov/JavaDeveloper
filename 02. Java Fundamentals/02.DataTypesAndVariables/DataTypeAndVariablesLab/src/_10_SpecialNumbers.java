import java.util.Scanner;

public class _10_SpecialNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rotations = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= rotations; i++) {

           int sum = 0;
           int copyOfI = i;

            for (int j = 0; j < Integer.toString(i).length(); j++) {
                sum += copyOfI % 10;
                copyOfI /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11){
                System.out.println(i + " -> True");
            }else {
                System.out.println(i + " -> False");
            }
        }
    }
}
