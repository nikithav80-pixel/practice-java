public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;

        // Check every pair of numbers
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println("Indices: " + i + " and " + j);
                    return; // exit once we find the pair
                }
            }
        }

        System.out.println("No two numbers add up to target");
    }
}
