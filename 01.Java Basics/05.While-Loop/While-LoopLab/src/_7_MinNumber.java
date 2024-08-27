import java.util.Scanner;

public class _7_MinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("Stop")){
                System.out.println(minNumber);
                break;
            }else {
                int num = Integer.parseInt(input);

                if (num < minNumber){
                    minNumber = num;
                }
            }
        }
    }
}
