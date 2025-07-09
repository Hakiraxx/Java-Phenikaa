package weak2;

public class Car {
    private String vin, make, model, color;
    private int price;

    public Car(String vin, String make, String model, String color, int price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getVin() {
        return this.vin;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setColor(String color){
       this.color = color;
    }
    public void setModel(String model){
       this.model = model;
    }
    public void setVin(String vin){
       this.vin = vin;
    } 
    public void setPrice(int price){
       this.price = price;
    }
    public void output(){
       System.out.print(
         this.getVin() + "\t" + this.getMake() + "\t" + this.getModel() + "\t" + this.getColor() + "\t" + this.getPrice()
       );
    }
}