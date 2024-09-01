import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class _3_ExactSumOfRealNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rotations = Integer.parseInt(sc.nextLine());

        BigDecimal sum = new BigDecimal(BigInteger.valueOf(0));

        for (int i = 0; i < rotations; i++) {
            BigDecimal temp = new BigDecimal(sc.nextLine());
            sum = sum.add(temp);
        }
        System.out.println(sum);
    }
}
