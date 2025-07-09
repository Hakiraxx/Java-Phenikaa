/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weak2;

/**
 *
 * @author tandu
 */
public class Employee {
    private int id, salary;
    private String firstName, lastName;
    public Employee(int id, int salary, String firstName, String lastName){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId(){
        return this.id;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getfirstName(){
        return this.firstName;
    }
    public String getlastName(){
        return this.lastName;
    }
    public String getName(){
       return firstName +" "+ lastName;
    }
    public int getAnnuaSalary(){
      return salary * 12;
    }
    public int raiseSalary(int percent){
        this.salary += this.salary * percent / 100;
        return this.salary;
    }
    public String toString() {
        return "Employee[id=" + id +
               ", name=" + getName() +
               ", salary=" + salary  +
               ", AnnuaSalary=" + getAnnuaSalary() + 
               ", raiseSalary=" + raiseSalary(30) + "]"; 
    }
}
