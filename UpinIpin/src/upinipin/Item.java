/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upinipin;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-31
 */

public class Item {
    // Deklarasi Variabel 
    private String name;                  // Menambahkan access modifier private
    private Item(){
        name = "Ipin";
    }
    
    public Item(String name){
        // this.name = new Item().name;
        this();                           // Memanggil item yang baru
        System.out.println(this.name);  // Menampilkan name yang baru
    }
}
