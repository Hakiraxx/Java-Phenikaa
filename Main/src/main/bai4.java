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
public class bai4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n, x;
    System.out.print("Nhap N: ");
    n = sc.nextInt();
    System.out.print("Nhap So x: ");
    x = sc.nextInt();
    int[] A = new int[n];
    for(int i = 0; i < n; i++){
     System.out.print("Nhap so thu tu " + i  + ": ");
            A[i] = sc.nextInt();   
    }
    boolean found = false;
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    
    
    }
