/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
      super();
    }
    
    public Circle(double radius){
        this.radius = 1.0;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return "Circle[" + super.toString() + "," + "radius=" + radius + ']';
    }
    
    
    
}
