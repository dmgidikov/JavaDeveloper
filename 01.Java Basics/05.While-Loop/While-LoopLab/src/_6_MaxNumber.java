import java.util.Scanner;

public class _6_MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("Stop")){
                System.out.println(maxNumber);
                break;
            }else {
                int num = Integer.parseInt(input);

                if (num > maxNumber){
                    maxNumber = num;
                }
            }
        }
    }
}