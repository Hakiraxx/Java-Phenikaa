/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }
    
    public void greets(Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

