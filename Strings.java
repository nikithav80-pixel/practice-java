public class Strings{
    public static void main(String[] args){
        // String a = "Hello";
        // String b = "Hello";
        // String c = a + " " + b;
        // System.out.println(c);
        // System.out.println("a == b: " + (a == b));
        // System.out.println("a.equals(b): " + a.equals(b));
         StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 200; i++) {
            sb.append(i);          
            System.out.println(sb);
    }
    }}