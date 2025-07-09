/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weak2;

/**
 *
 * @author tandu
 */
public class Rectangle {
    private float length, width;
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength(){
      return this.length;
    }
    public float getWidth(){
      return this.width;
    }
    public void setLength(float length){
      this.length = length;
    }
    public void setWidth(float width){
      this.width = width;
    }
    public double getArea(){
      return length * width;
    }
    public double getPerimeter(){
      return ( 2 * (length + width));
    }
    public String toString() {
        return "Rectangle[length=" + length +
               ", width=" + width +
               ", area=" + getArea() +
               ", perimeter=" + getPerimeter() + "]";
    }
}
