import java.util.Scanner;

public class _4_EvenPowersOf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number =Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++){

            if(i==0) {
                System.out.println(1);;
            }

            if((i%2==0)&&(i!=0)) {

                int result = 1;

                for (int j =1;  j <=i; j++)
                {
                    result *= 2;
                }
                System.out.println(result);;
            }
        }
    }
}
