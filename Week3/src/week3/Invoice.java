/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author tandu
 */
public class Invoice {
    private int id;
    private double amount;
    private Customer customer;
    public Invoice(int id, double amount, Customer customer){
       this.id = id;
       this.customer = customer;
       this.amount = amount;
}
    public int getID(){
      return this.id;
    }
    public Customer getCustomer(){
      return this.customer;
    }
    public double getAmount(){
      return this.amount;
    }
    public void  setAmount(double amount){
      this.amount = amount;
    }
    public void setCustomer(Customer customer){
      this.customer = customer;
    }
    public int getCustomerID(){
      return this.customer.getID();
    }
    public int getDiscount(){
      return this.customer.getDiscount();
    }
    public String getName(){
      return this.customer.getName();
    }
    public double getAmountAfterDiscount(){
      return this.customer.getDiscount() * amount;
    }
    public String toString(){
      return "Invoice[" + "id=" + id + ",customer=" + customer.toString() + ",amount=" + getAmountAfterDiscount() + "]";
    
    }
}
