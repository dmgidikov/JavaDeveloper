import com.sun.tools.javac.Main;

import java.util.Scanner;

public class _3_DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositLenghtInMonths = Integer.parseInt(scanner.nextLine());
        double interestPercent = Double.parseDouble(scanner.nextLine())  / 100;

        double interest = depositAmount * interestPercent;
        double interestPerMonth = interest / 12;

        double result = depositAmount + depositLenghtInMonths * interestPerMonth;
        System.out.println(result);
    }
}
