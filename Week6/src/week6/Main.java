/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author TanDungNguyen
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Animal1");
        System.out.println(a);

        Mammal m = new Mammal("Mammal");
        System.out.println(m);

        Cat c = new Cat("Kitty");
        System.out.println(c);
        c.greets();

        Dog d1 = new Dog("Pluto");
        Dog d2 = new Dog("Bruno");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
