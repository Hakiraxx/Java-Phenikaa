/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author tandu
 */
public class Customer {
    private int id, discount;
    private String name;
    public Customer(int id, int discount, String name){
       this.id = id;
       this.discount = discount;
       this.name = name;
    }
    public int getID(){
      return this.id;
    }
    public int getDiscount(){
      return this.discount;
    }
    public String getName(){
      return this.name;
    }
    public void setDiscount(int discount){
      this.discount = discount;
    }
    public String toString(){
      return name + "(" + id + ")" + "(" + discount + "%)";
    }
    
}
