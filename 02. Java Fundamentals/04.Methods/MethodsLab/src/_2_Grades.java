import java.util.Scanner;

public class _2_Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        PrintSignOfIntNumber(number);
    }

    public  static  void PrintSignOfIntNumber(double num){

        if (num >= 2 && num < 3){
            System.out.println("Fail");
        }else if(num >= 3 && num < 3.5){
            System.out.println("Poor");
        }else if(num >= 3.5 && num < 4.5){
            System.out.println("Good");
        }else if(num >= 4.5 && num < 5.5){
            System.out.println("Very good");
        }else if(num >= 5.5 && num <= 6){
            System.out.println("Excellent");
        }
    }
}
