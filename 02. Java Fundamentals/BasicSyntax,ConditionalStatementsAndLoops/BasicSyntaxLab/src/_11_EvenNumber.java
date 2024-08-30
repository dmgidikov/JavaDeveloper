import java.util.Scanner;

public class _11_EvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            int input = Math.abs(Integer.parseInt(scanner.nextLine()));

            if (input % 2 == 0){
                System.out.println("The number is: " + input);
                break;
            }else{
                System.out.println("Please write an even number.");
            }
        }
    }
}
