import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class studentmarks{
    public static void main(String[] args) {
        
        HashMap<Integer, Student> students = new HashMap<>();

       
        students.put(101, new Student("Nikitha", 85));
        students.put(102, new Student("Rahul", 92));
        students.put(103, new Student("Priya", 92));
        students.put(104, new Student("Arjun", 78));
        students.put(105, new Student("Sneha", 90));
        students.put(106, new Student("Kiran", 88));
        students.put(107, new Student("Meena", 76));

        
        System.out.println("All Students:");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " → " + entry.getValue());
        }

        
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;

        for (Student s : students.values()) {
            if (s.marks > highest) highest = s.marks;
            if (s.marks < lowest) lowest = s.marks;
            sum += s.marks;
        }

        double average = (double) sum / students.size();

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Average Marks: " + average);

       
        students.entrySet().removeIf(entry -> entry.getValue().marks < 80);

        System.out.println("\nAfter removing marks below 80:");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " → " + entry.getValue());
        }

       
        boolean has90 = students.values().stream().anyMatch(s -> s.marks == 90);
        System.out.println("\nIs there a student with 90 marks? " + (has90 ? "Yes" : "No"));
    }
}
