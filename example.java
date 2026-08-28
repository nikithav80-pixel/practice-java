public class example {
    public static void main(String[] args) {
        String str = "apa";

        System.out.println("All substrings of \"" + str + "\":");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
         }
        }
        String reversed = new StringBuilder(str).reverse().toString();

        
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
