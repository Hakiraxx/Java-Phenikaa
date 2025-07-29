/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author TanDungNguyen
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Shape> item = new ArrayList<>();
        //Bat dau doc file
        try{
        FileReader Freader = new FileReader("C:\\Users\\tandu\\OneDrive\\Documents\\NetBeansProjects\\Week8\\src\\week8\\shape.txt");
        BufferedReader Breader = new BufferedReader(Freader);
        String line;
        while((line = Breader.readLine()) != null){
            String[] parts = line.split(",");
            String ShapeType = parts[0];
            //phan loai
            switch (ShapeType) {
                case "Circle" -> {
                    double radius = Double.parseDouble(parts[1]);
                    String colors = parts[2];
                    boolean filled = Boolean.parseBoolean(parts[3]);
                    Circle c = new Circle(radius, colors, filled);
                    item.add(c);
                }
                case "Rectangle" -> {
                    double width = Double.parseDouble(parts[1]);
                    double length = Double.parseDouble(parts[2]);
                    String colors = parts[3];
                    boolean filled = Boolean.parseBoolean(parts[4]);
                    Rectangle r = new Rectangle(width, length , colors, filled);
                    item.add(r);
                }
                case "Square" -> {
                    double side = Double.parseDouble(parts[1]);
                    String colors = parts[2];
                    boolean filled = Boolean.parseBoolean(parts[3]);
                    Square r = new Square(side , colors, filled);
                    item.add(r);
                }
                default -> System.out.println(ShapeType);
            }
        }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        
        //Doc file toString va get Area + perimeter
        for(Shape s: item){
          System.out.println(s.toString());
          System.out.println("Area= " + s.getArea() + ", perimeter= " + s.getPerimeter());
        }
        //Thong ke So Luong va Tong Dien Tich
        double totalArea = 0, 
               totalPerimeter = 0, 
               countSquare = 0, 
               countRectangle = 0, 
               countCircle = 0;
        for(Shape s: item){
            totalArea += s.getArea();
            totalPerimeter += s.getPerimeter();
            if(s instanceof Square){
                countSquare++;
            }
            else if(s instanceof Rectangle){
                countRectangle++;
            }
            else if(s instanceof Circle){
                countCircle++;
            }
        }
        System.out.println(totalArea); // tong dien tich
        System.out.println(totalPerimeter); // tong chu vi
        System.out.println(countCircle); // so luong Circle
        System.out.println(countRectangle); // so luong Rectangle
        System.out.println(countSquare); // so luong Square
        //Ghi vao file moi
        try(PrintWriter pw = new PrintWriter("output.txt")){
        for (Shape s : item) {
        pw.println(s.toString());
        pw.printf("Area: %.2f, Perimeter: %.2f%n", s.getArea(), s.getPerimeter());
    }
       pw.println("\ntotalPerimeter: %.2f%n" + totalArea);
       pw.println("totalPerimeter: %.2f%n" + totalPerimeter);
       pw.println("countCircle: %.2f%n" + countCircle);
       pw.println("countRectangle: %.2f%n" + countRectangle);
       pw.println("countSquare: %.2f%n" + countSquare);
       pw.close();
       } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
       }
       //sap xep lai roi ghi vao
       item.sort((a, b) -> Double.compare(a.getArea(), b.getArea()));
       try(PrintWriter pw = new PrintWriter("C:\\Users\\tandu\\OneDrive\\Documents\\NetBeansProjects\\Week8\\src\\week8\\sorted_output.txt")){
        for (Shape s : item) {
        pw.println(s.toString());
        pw.printf("Area: %.2f, Perimeter: %.2f%n", s.getArea(), s.getPerimeter());
    }
       pw.println("\ntotalPerimeter: %.2f%n" + totalArea);
       pw.println("totalPerimeter: %.2f%n" + totalPerimeter);
       pw.println("countCircle: %.2f%n" + countCircle);
       pw.println("countRectangle: %.2f%n" + countRectangle);
       pw.println("countSquare: %.2f%n" + countSquare);
       pw.close();
       } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
       }
       
       
        
    }
}
