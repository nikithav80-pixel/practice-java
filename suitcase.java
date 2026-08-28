
import java.util.*;
public class suitcase {


    static String[] items = {"Shoes", "Jeans", "T-Shirt", "Laptop", "Book"};
    static int[] weights = {2, 3, 1, 5, 2};  // weights in kg
    static int limit = 7;  // suitcase weight limit

    public static void main(String[] args) {
        List<String> chosen = new ArrayList<>();
        backtrack(0, 0, chosen);
    }

    // Backtracking function
    static void backtrack(int index, int currentWeight, List<String> chosen) {
        // If within limit, print the current combination
        if (currentWeight <= limit) {
            System.out.println("Packed: " + chosen + " | Weight: " + currentWeight);
        }

        // Stop if we've checked all items
        if (index == items.length) return;

        // Choice 1: include this item
        chosen.add(items[index]);
        backtrack(index + 1, currentWeight + weights[index], chosen);

        // Backtrack: remove the item and try without it
        chosen.remove(chosen.size() - 1);
        backtrack(index + 1, currentWeight, chosen);
    }
}

    

