
import java.util.Scanner;
public class recursive {
    

    // Recursive method
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}


    

