import java.util.Scanner;

public class _8_LowerOrUpper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if (Character.isUpperCase(a)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
