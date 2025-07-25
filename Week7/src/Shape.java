/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TanDungNguyen
 */
public abstract class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){};
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
     @Override
    public String toString() {
        return "Shape[" + "color=" + color + ", filled=" + filled + ']';
    }
    
}
