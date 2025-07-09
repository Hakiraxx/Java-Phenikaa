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
public class bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, sum;
        System.out.print("Nhap N so: ");
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
