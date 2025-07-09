/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author tandu
 */
public class Book {
    private int qty = 0;
    private String name;
    private double price;
    private Author author;
    public Book(String name, int qty, double price, Author author){
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.author = author;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
     public int getQty() {
        return this.qty;
    }
    
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString() {
        return "Book[name=" + name + ",Author=" + author + ",price=" + price + ",qty=" + qty + "]";
    }
}
