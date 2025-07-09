/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_continue;

/**
 *
 * @author tandu
 */
public class InVoiceItem {
    private String id, desc;
    private int qty;
    private double unitPrice;
    public InVoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId(){
       return this.id;
    }
    public String getDesc(){
       return this.desc;
    }
    public int getQty(){
       return this.qty;
    }
    public double getUnitPrice(){
       return this.unitPrice;
    }
    public void setQty(int qty){
       this.qty = qty;
    }
    public void setUnitPrice(int unitPrice){
       this.unitPrice = unitPrice;
    }
    public double getTotal(){
       return unitPrice * qty;
    }
    public String toString() {
        return "InVoiceItem[id=" + id +
               ", desc=" + desc +
               ", qty=" + qty +
               ", unitPrice=" + unitPrice +
               ", total=" + getTotal() + "]";
    }
}
