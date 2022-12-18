import java.util.Scanner;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Food> breakfast = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //  Collections.sort(breakfast, new FoodComparator());
        String choice = "-";
        while (choice.contains("-")) {
            choice = sc.nextLine().toLowerCase(Locale.ROOT);
            if (choice.equals("-goland")) {
                System.out.println("gramms: ");
                String gramms1 = sc.nextLine();
                breakfast.add(new golandCheese(gramms1));
            }
            if (choice.equals("-apple")) {
                System.out.println("size: ");
                String size = sc.nextLine();
                breakfast.add(new Apple(size));
            }
            if (choice.equals("-cheese")) {
                System.out.println("gramms: ");
                String gramms = sc.nextLine();
                breakfast.add(new Cheese(gramms));
            }
            if (choice.equals("-eggs")) {
                System.out.println("amount: ");
                String amount = sc.nextLine();
                breakfast.add(new Eggs(amount));
            }

        }
        System.out.println("sorted: ");
        Collections.sort(breakfast, new FoodComparator());
        List<Food> breakfast1 = new ArrayList<>();
        Collections.reverse(breakfast);


        int sum = 0;
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                sum += item.calculateCalories();
            } else {
                break;
            }
        }
        System.out.println("sum: " + sum);


        for (int i = 0; i < breakfast.toArray().length; i++) {
            System.out.println(breakfast.get(i).toString());
        }
    }
}