import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1_Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> temp = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        ArrayList<Integer> wagons = new ArrayList<>(temp);
        int maxCapacityPerWagon = Integer.parseInt(scanner.nextLine());


        while (true){

            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).toList();

            if (input.get(0).equals("end")){
                break;
            }

            if (input.get(0).equals("Add")){
                int newWagonWithSits = Integer.parseInt(input.get(1));
                wagons.add(newWagonWithSits);
            }else{
                int peopleToSit = Integer.parseInt(input.getFirst());

                for (int i = 0; i < wagons.size(); i++) {

                    int currentPeopleInWagon = wagons.get(i);

                    if (currentPeopleInWagon + peopleToSit <= maxCapacityPerWagon){
                        wagons.set(i, currentPeopleInWagon + peopleToSit);
                        break;
                    }
                }
            }
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}