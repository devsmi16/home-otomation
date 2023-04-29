import java.util.*;

public class HomeOtomation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, ArrayList<String>> homes = new HashMap<>();
        System.out.println("Please enter house number and names of persons (Enter 'q' for Exit): ");

        do {
            System.out.println("House no: ");
            String houseNo = input.nextLine();

            if (houseNo.equals("q")) {
                break;
            }
            System.out.println("persons name: ");
            String[] persons = input.nextLine().split(",");

            ArrayList<String> personList = new ArrayList<>();
            homes.put(Integer.parseInt(houseNo), personList);
            break;
        } while (true);

        do {
            System.out.println("You want to know how many people live in the house? (Enter 'q' for output): ");
            String houseNo = input.nextLine();
            if (houseNo.equals("q")) {
                break;
            }
            ArrayList<String> personList = homes.get(Integer.parseInt(houseNo));

            if (personList != null) {
                System.out.println("at home " + personList.size() + " " + "person lives" + String.join(",", personList));
            } else {
                System.out.println("There is no house for the house number you entered.");
            }
            break;
        } while (true);
    }
}