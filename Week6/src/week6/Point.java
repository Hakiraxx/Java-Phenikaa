/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class Point {
    float x = 0.0f;
    float y = 0.0f;
    
    public Point(){}
    
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void SetXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    
     public float[] getXY() {
        return new float[] { x, y };
    }
     
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    
    
}
