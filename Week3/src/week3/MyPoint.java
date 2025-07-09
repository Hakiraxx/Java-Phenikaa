/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author tandu
 */
public class MyPoint {
    private int x, y = 0;
    public MyPoint(int x, int y){
      this.x = x;
      this.y = y;
    }
    public int getX(){
      return this.x;
    }
    public int getY(){
      return this.y;
    }
    public void setX(int x){
      this.x = x;
    }
    public void setY(int y){
      this.y = y;
    }
    public int[] getXY() {
        return new int[] { x, y };
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
    public double distance() {
        return distance(0, 0);
    }

    
    
}
