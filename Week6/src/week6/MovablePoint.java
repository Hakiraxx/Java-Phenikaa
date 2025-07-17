/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
      super();
    }
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    } 
    
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }   
    
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }
    
    @Override
    public String toString() {
        return super.toString() + ",(" + xSpeed + "," + ySpeed + ")";
    }
    
    public MovablePoint move(){
       x += xSpeed;
       y += ySpeed;
       return this;
    }
    
}
