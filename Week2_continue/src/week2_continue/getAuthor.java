/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_continue;

/**
 *
 * @author tandu
 */
public class getAuthor {
     public static void main(String[] args) {
        Author a = new Author("Nguyen Van A", "vana@gmail.com", 'm');
        System.out.println(a); 
        a.setEmail("vana123@gmail.com");
        System.out.println(a.getEmail()); 
    }
}
