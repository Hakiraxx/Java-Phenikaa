/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author TanDungNguyen
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    public Student(String name, String addresss, String program, int year, double fee){
         super(name, addresss);
         this.program = program;
         this.year = year;
         this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

     @Override
    public String toString() {
        return "Student[" + super.toString() +",program=" + program +",year=" + year +",fee=" + fee + "]";
    }
    
    
}
