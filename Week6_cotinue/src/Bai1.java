
import week6_cotinue.Circle;

public class Bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue", true);
        System.out.println(circle); 
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}