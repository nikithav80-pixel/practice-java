import java.util.Scanner;

public class nisha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        String lowercase = sentence.toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < lowercase.length(); i++) {
            char ch = lowercase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the sentence: " + vowelCount);

        sc.close();
    }
}
