public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append(" java programming");
        System.out.println(sb);
        sb.insert(5, "java");
        System.out.println(sb);
        sb.reverse();
        sb.delete(5, 10);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}