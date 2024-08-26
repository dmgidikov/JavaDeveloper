import java.util.Scanner;

public class _3_AnimalType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile"); break;
            case "dog":
                System.out.println("mammal"); break;
            default:
                System.out.println("unknown"); break;
        }
    }
}
