package weak2;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red"; 
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
}