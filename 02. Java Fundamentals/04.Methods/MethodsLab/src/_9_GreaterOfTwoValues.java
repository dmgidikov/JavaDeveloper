import java.util.Scanner;

public class _9_GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "string":
                String firstString = scanner.nextLine().toLowerCase();
                String secondString = scanner.nextLine().toLowerCase();
                System.out.println(GetMax(firstString, secondString)); break;
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(GetMax(firstNum, secondNum)); break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(GetMax(firstChar, secondChar)); break;
        }
    }

    private static int GetMax(int first, int second) {

       int result = Math.max(first, second);
       return result;
    }

    private static char GetMax(char first, char second) {

        char result = ((char) Math.max((int) first, (int) second));
        return result;
    }

    private static String GetMax(String first, String second) {

        int result = first.compareTo(second);

        if (result >= 0){
            return first;
        }else {
            return second;
        }
    }
}