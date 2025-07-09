/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_continue;

/**
 *
 * @author tandu
 */
public class newBall {
     public static void main(String[] args) {
        ball b = new ball(0.0f, 0.0f, 5, 1.5f, -2.0f);
        System.out.println(b); 
        b.move();
        System.out.println(b); 
        b.reflectHorizontal();
        b.move();
        System.out.println(b); 
        b.reflectVertical();
        b.move();
        System.out.println(b); 
    }
}
