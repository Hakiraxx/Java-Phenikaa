/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author TanDungNguyen
 */
public class MovablePoint implements Movable {
    private int x ,y, xSpeed, ySpeed ;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + "), speed=" + "(" + xSpeed + "," + ySpeed + ")"; 
    }

    @Override
    public void MoveUp() {
        y -= ySpeed;
    }

    @Override
    public void MoveDown() {
        y += ySpeed;
    }

    @Override
    public void MoveLeft() {
        x -= xSpeed;
    }

    @Override
    public void MoveRight() {
        x += xSpeed;
    }
}
