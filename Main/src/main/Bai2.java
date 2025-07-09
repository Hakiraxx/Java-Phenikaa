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
public class Bai2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Nhap n:");
    n = sc.nextInt();
        int[] A = new int[n];
    for(int i = 0; i < n; i++){
      System.out.print("Nhap so thu tu " + (i + 1)  + ": ");
      A[i] = sc.nextInt();
    }
    int Max = A[0];
    int Min = A[0];
    for(int i = 0; i < n; i++){
        if(A[i] > Max) Max = A[i];
        if(A[i] < Min) Min = A[i];
    }
    System.out.println(Max + " " + Min);
        sc.close();
    
    }
    
}
