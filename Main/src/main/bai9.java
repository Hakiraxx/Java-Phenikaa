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
public class bai9 {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.print("Nhap N: ");
   n = sc.nextInt();
   for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
   } 
}
