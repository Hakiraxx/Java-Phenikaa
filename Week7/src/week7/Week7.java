/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TanDungNguyen
 */
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MovableCircle> circles = new ArrayList<>();
        int n;
        System.out.print("Nhap So Luong Hinh Tron: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Hinh tron so " + i +": ");
            System.out.print("nhap x: ");
            int x = sc.nextInt();
            System.out.print("nhap y: ");
            int y = sc.nextInt();
            System.out.print("nhap xSpeed: ");
            int xSpeed = sc.nextInt();
            System.out.print("nhap ySpeed: ");
            int ySpeed = sc.nextInt();
            System.out.print("nhap radius: ");
            int radius = sc.nextInt();
            MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, radius);
            circles.add(circle);
    }
        System.out.print("Danh Sach Hinh Tron:");
        for (MovableCircle circle : circles) {
            System.out.println(circle);
        }
   }
}