import java.util.Scanner;

public class _1_ReadText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            String input = scanner.nextLine();

            if (input.equals("Stop")){
                break;
            }else {
                System.out.println(input);
            }
        }
    }
}
