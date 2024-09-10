import java.util.*;

public class _2_ChangeList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> tempList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        ArrayList<Integer> numbers = new ArrayList<>(tempList);

        while (true){

            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();

            if (input.get(0).equals("end")){
                break;
            }

            if (input.get(0).equals("Delete")){

                int numToDelete = Integer.parseInt(input.get(1));
                numbers.removeAll(Collections.singleton(numToDelete));

            }else if(input.get(0).equals("Insert")){

                int numberToInsert = Integer.parseInt(input.get(1));
                int indexToInsertAt = Integer.parseInt(input.get(2));

                numbers.add(indexToInsertAt, numberToInsert);
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}