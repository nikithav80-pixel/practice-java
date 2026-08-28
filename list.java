import java .util.ArrayList;
import java.util.List;

public class list{
    public static void main (String[] args){
        List<String> list = new ArrayList<>();
        list.add("siya");
        list.add("Nikitha");
        list.add("Nisha");
        list.add("Prarthana");
        System.out.println("list of the students: " + list);
        System.out.println("Access the elements :"+list.get(2));
        System.out.println("Remove the elements :"+list.remove(1));
        list.set(1,"niki");
        System.out.println("Updated list: " + list);
        System.out.println("Size of the list: " + list.size());
    }
}