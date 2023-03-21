import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Läs in ett godtyckligt antal tal (double) till en lista, och skicka sen listan
        // till en metod isSorted som returnerar true om talen är sorterade i stigande ordning

        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Ange tal: ");
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        if (isSorted(numbers)) {
            System.out.println("Sorterad");
        } else {
            System.out.println("Inte sorterad");
        }
    }
}