/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class Retangle extends Shape {
    double width;
    double length;
    public Retangle(){
        super();
    }
    
    public Retangle(double width, double length){
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Retangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = 1.0;
        this.length = 1.0;
    }

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
    
    public double getArea(){
        return 2 * ( width + length );
    }
    
    public double getPerimeter(){
        return width * length;
    }
    
    
    
    
}
