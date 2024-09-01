import java.util.Scanner;

public class _11_RefactorValumeOfPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length, width, V;
        System.out.println("Length: ");
        length = Double.parseDouble(sc.nextLine());
        System.out.println("Width: ");
        width = Double.parseDouble(sc.nextLine());
        V = (length * width) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
