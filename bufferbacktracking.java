public class bufferbacktracking {
    static String food[] = { "pizza", "burger", "pasta", "sushi" };
    static int[] calories = { 300, 500, 400, 200 };
    
    public static void findCombinations(int index, int targetCalories, String currentCombination) {
        if (targetCalories == 0) {
            System.out.println(currentCombination);
            return;
        }
        if (index >= food.length || targetCalories < 0) {
            return;
        }

        // Include the current food item
        findCombinations(index, targetCalories - calories[index], currentCombination + food[index] + " ");

        // Exclude the current food item and move to the next
        findCombinations(index + 1, targetCalories, currentCombination);
    }
}
