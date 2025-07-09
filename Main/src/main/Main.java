/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author tandu
 */
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu tu " + (i + 1)  + ": ");
            A[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        System.out.println("Tong cac so trong mang la: " + sum);
        sc.close();
    }
    
}
