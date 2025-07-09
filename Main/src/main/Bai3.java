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
public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
        System.out.print("Nhap so thu tu " + (i + 1)  + ": ");
         A[i] = sc.nextInt(); 
        }
        int chan = 0;
        int le = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.println(chan);
        System.out.println(le);
        sc.close();
        
    
    }
    
}
