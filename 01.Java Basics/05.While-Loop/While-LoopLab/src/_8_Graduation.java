import java.util.Scanner;

public class _8_Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 0;
        int grade = 0;
        int firstTimeExcluded = 0;
        double averageMark = 0;

        while (true) {

            if (grade == 12){
                System.out.printf("%s graduated. Average grade: %.2f", name, (averageMark / 12));
                break;
            }else {
                double mark = Double.parseDouble(scanner.nextLine());

                if (mark < 4) {
                    counter++;

                    if (counter > 1) {
                        System.out.printf("%s has been excluded at %d grade", name, firstTimeExcluded);
                        break;
                    }

                    firstTimeExcluded = grade + 1;
                }else {
                    averageMark += mark;
                }

                grade++;
            }
        }
    }
}
