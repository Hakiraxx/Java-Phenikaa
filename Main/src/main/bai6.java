/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author tandu
 */
public class bai6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Nhap So Nguyen Duong: ");
    n = sc.nextInt();
    boolean lasonguyento = true;
    if(n < 2){
     lasonguyento = false;   
    } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    lasonguyento = false;
                    break;
                }
            }
        }
    if(lasonguyento){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
