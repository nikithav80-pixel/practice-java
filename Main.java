public abstract class Shape{//Abstract class
    private String color;
    public Shape(String color){ //parametarized constructor
        this.color
    }
    public String getCOlor(){//encapsulation
        return color;
    }
    public abstract double calculateArea();//absteract method
}
public class Circle extends Shape{//inheritance
    private double radius;
    public Circle(String color, double radius){//parametarized constructor
        super(color);
        this.radius = radius;
    }
    @Override//method overriding
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
public class Rectangle extends Shape{//inheritance
    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override//method overriding
    public double calculateArea(){
        return length * width;
    }
}
public class Practice{//main class
    public static void main(String[] args){
       
}


