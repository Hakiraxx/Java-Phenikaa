/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_continue;

/**
 *
 * @author TanDungNguyen
 */
public class Rectangle implements GeometricObject {
    private double width, length;
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "width=" + width + ", lenght=" + length + ']';
    }

    @Override
    public double getArea() {
        return 2 * ( width + length);
    }

    @Override
    public double getPerimeter() {
         return width * length;
    }
}