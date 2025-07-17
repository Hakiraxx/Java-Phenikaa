/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_cotinue;

/**
 *
 * @author TanDungNguyen
 */
public class Square extends Rectangle {
    public Square(){}
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filld){
        super(side, side, color, filld);
    }
    
    public double getSide() {
        return getWidth(); 
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    } 
    
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
