/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author TanDungNguyen
 */
public class author {
    private String name, id;
    public author(String name, String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "author{" + "name=" + name + ", id=" + id + '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public author(String name) {
        this.name = name;
    }
    
}
