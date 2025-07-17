/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_cotinue;

/**
 *
 * @author TanDungNguyen
 */
public abstract class Shape {
    private String color;
    private boolean filld;
    
    public Shape(){};
    
    public Shape(String color, boolean filld){
        this.color = "red";
        this.filld = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilld() {
        return filld;
    }

    public void setFilld(Boolean filld) {
        this.filld = filld;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return "Shape[" + "color=" + color + ", filld=" + filld + ']';
    }
    
}
