import java.util.Scanner;

public class _4_SequenceNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int startingPoint = 1;

        while (true){

            if (startingPoint <= input){
                System.out.println(startingPoint);

                startingPoint = startingPoint * 2 + 1;
            }else {
                break;
            }
        }
    }
}
