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
public class bai7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Nhap Nam: ");
    n = sc.nextInt();
    boolean isLeap = false;
    if (n % 400 == 0) {
            isLeap = true;
        } else if (n % 100 == 0) {
            isLeap = false;
        } else if (n % 4 == 0) {
            isLeap = true;
        }
        if (isLeap) {
            System.out.println("LEAP");
        } else {
            System.out.println("COMMON");
        }
        sc.close();
    }
}
