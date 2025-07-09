/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_continue;

/**
 *
 * @author tandu
 */
public class getTime {
    public static void main(String[] args) {
        Time t = new Time(23, 59, 59);
        System.out.println(t);           
        t.nextSecond();
        System.out.println(t);           
        t.previousSecond();
        System.out.println(t);           
    }
}
