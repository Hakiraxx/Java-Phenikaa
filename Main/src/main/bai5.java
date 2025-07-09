/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author tandu
 */
public class bai5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang cuu chuong " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            if (i < 9) {
                System.out.println();
            }
        }
    }
}
