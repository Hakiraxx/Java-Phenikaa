/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_cotinue;

/**
 *
 * @author TanDungNguyen
 */
public class Rectangle extends Shape{
    private double width, length;
    
    public Rectangle(){
        super();
    };
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    };
    
    public Rectangle(double width, double length, String color, boolean filld){
        super(color, filld);
        this.width = width;
        this.length = length;
    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
         return 2 * ( width + length );
    }

    @Override
    public double getPerimeter() {
        return width * length;
    }
    
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
