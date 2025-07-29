/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author TanDungNguyen
 */
public class MainBin {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        ArrayList<Shape> item = new ArrayList<>();
        item.add(new Circle(2.5, "red", true));
        item.add(new Rectangle(3, 4, "blue", false));
        item.add(new Square(5, "green", true));
        item.add(new Circle(1.2, "yellow", false));
        item.add(new Rectangle(6, 2, "black", true));
        item.add(new Square(3.3, "orange", false));
        //ghi file
        try {
            FileOutputStream fop = new FileOutputStream("shapes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fop);
            oos.writeObject(item);
            oos.close();
            System.out.println("Ghi");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        //doc file
        try{
            FileInputStream fip = new FileInputStream("shapes.dat");
            ObjectInputStream ois = new ObjectInputStream(fip);
            ArrayList<Shape> readList = (ArrayList<Shape>) ois.readObject();
            for (Shape s : readList) {
                System.out.println(s);
                System.out.printf("Area: %.2f, Perimeter: %.2f%n", s.getArea(), s.getPerimeter());
            }
            // So Sanh
            if(item.size() != readList.size()){
              System.out.println("Khac So Luong");
            } else if(item.size() == readList.size()){
                boolean sosanh = true;
                for(int i = 0; i < item.size(); i++){
                    Shape s1 = item.get(i);
                    Shape s2 = readList.get(i);
                    if(!(s1.getClass().equals(s2.getClass()) &&
              s1.toString().equals(s2.toString()) &&
              Math.abs(s1.getArea() - s2.getArea()) < 0.01 &&
              Math.abs(s1.getPerimeter() - s2.getPerimeter()) < 0.01)){
                        sosanh = false;
                } 
              }
             if(!sosanh){
                 System.out.println("1 hoac nhieu phan tu khac nhau");
             }
             if(sosanh){
                 System.out.println("tat ca phan tu giong nhau");
             }
            
            }
        } 
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
    }
}
