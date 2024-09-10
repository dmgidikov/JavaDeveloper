import java.util.*;

public class _3_HouseParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> peopleGoingToParty = new ArrayList<>();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {

            List<String> temp = Arrays.stream(scanner.nextLine().split(" ")).toList();

            String name = temp.getFirst();
            int length = temp.size();

            if (length == 3){
                if (!peopleGoingToParty.contains(name)){
                    peopleGoingToParty.add(name);
                }else {
                    System.out.println(name + " is already in the list!");
                }
            }else {
                if (!peopleGoingToParty.contains(name)){
                    System.out.println(name + " is not in the list!");
                }else {
                    peopleGoingToParty.remove(name);
                }
            }
        }

        for (String string : peopleGoingToParty) System.out.println(string);
    }
}