import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _3_MergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        List<Integer> leftNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        List<Integer> rightNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        
        int smallestLength = Math.min(leftNumbers.size(), rightNumbers.size());

        List<Integer> mixedList = new ArrayList<>();
        
        for (int i = 0; i < smallestLength; i++) {
            mixedList.add(i, leftNumbers.get(i));
            mixedList.add(i + 1, rightNumbers.get(i));
        }
        
        if (leftNumbers.size() > rightNumbers.size())
            AddRestNumbers(smallestLength, leftNumbers, mixedList);
        else
            AddRestNumbers(smallestLength, rightNumbers, mixedList);

        for (Integer i : mixedList) {
            System.out.print(i + " ");
        }
    }

    private static void AddRestNumbers(int smallestLength, List<Integer> numbers, List<Integer> mixedList) {
        for (int i = smallestLength; i < numbers.size(); i++) {

            int currentElement = numbers.get(i);
            mixedList.add(currentElement);
        }
    }
}