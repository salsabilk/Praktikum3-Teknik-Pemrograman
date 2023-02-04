/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelasdua;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-31
 */

public class KelasDua {
    {
        System.out.println(5);              
    }
    
    // Ketika mengakses class KelasDua, maka akan langsung masuk ke method main
    public static void main(String[] args) {
        System.out.println(6);              // Mencetak nilai 6
        
        KelasSatu satu = new KelasSatu();     // Program akan memproses method KelasSatu objek satu
        
        KelasSatu dua = new KelasSatu(10);  // Setelah memproses method KelasSatu objek satu,
                                              // Program akan memproses method KelasSatu objek dua
    }
    
}
