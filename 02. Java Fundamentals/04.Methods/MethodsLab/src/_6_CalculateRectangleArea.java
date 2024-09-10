import java.util.Scanner;

public class _6_CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = GetRectangleArea(width, length);
        System.out.println(area);
    }

    private static int GetRectangleArea(int width, int length) {
        return  width * length;
    }
}