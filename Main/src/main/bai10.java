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
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] hoTen = new String[n];
        double[] diemTB = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();
            System.out.print("Nhap diem trung binh: ");
            diemTB[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        System.out.println("\n+----+------------------------+----------+");
        System.out.println("| STT|        Ho Ten          | Diem TB  |");
        System.out.println("+----+------------------------+----------+");
        for (int i = 0; i < n; i++) {
            System.out.printf("| %2d | %-22s | %8.2f |\n", 
                             (i + 1), hoTen[i], diemTB[i]);
        }
        System.out.println("+----+------------------------+----------+");
        sc.close();
    }
}
