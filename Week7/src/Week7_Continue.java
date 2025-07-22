
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TanDungNguyen
 */
public class Week7_Continue  {
    public static void main(String[] args) {
        double Area = 0, Perimeter = 0, countCircle = 0, countRectangle = 0, countSquare = 0;
        ArrayList<Shape> item = new ArrayList<>();
        item.add(new Circle(2.0, "blue", true));                 // Circle
        item.add(new Rectangle(4.0, 5.0, "green", false));       // Rectangle
        item.add(new Square(3.0, "yellow", true));               // Square
        item.add(new Circle(1.5, "black", false));               // Circle
        item.add(new Square(4.2, "pink", true));                 // Square
        System.out.println("Danh Sach Cac Hinh");
        
        for(Shape s:item){
            System.out.println(s);
        }
        
         for(Shape s:item){
            Area += s.getArea();
            Perimeter += s.getPerimeter();
        }
        System.out.println("Tong Dien Tich: " + Area);
        System.out.println("Tong Chu Vi: " + Perimeter);
      
        for (Shape s : item) {
            if (s instanceof Square) {
                countSquare++;
            } else if (s instanceof Rectangle) {
                countRectangle++;
            } else if (s instanceof Circle) {
                countCircle++;
            }
        }
        System.out.println("So Luong Square: " + countSquare);
        System.out.println("So Luong Rectangle: " + countRectangle);
        System.out.println("So Luong Circle: " + countCircle );
        
       for (Shape s : item) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle: radius = " + c.getRadius());
            } else if (s instanceof Square) {
                Square sq = (Square) s;
                System.out.println("Square: side = " + sq.getSide());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle: width = " + r.getWidth() + ", length = " + r.getLength());
            }
        }
       
       Shape max = item.get(0);
        for (Shape s : item) {
            if (s.getArea() > max.getArea()) {
                max = s;
            }
        }
        System.out.println(max);
        item.sort((a, b) -> Double.compare(b.getArea(), a.getArea()));
        for (Shape s : item) {
            System.out.println(s);
        }
    }
}
