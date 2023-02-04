/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasdua;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-31
 */

public class KelasSatu {
    // Urutan pemanggilan blok yaitu static, non static, kemudian blok public
    
    // Yang kedua dipanggil (Non Static)
    // Blok non statis dapat dipanggil setiap kali program dijalankan
    {
        System.out.println(11);
    }
    
    // Blok static adalah blok pertama yang diproses, dan hanya dapat dijalankan dan dipanggil sekali 
    // Static dapat dipanggil tanpa harus membuat instansi objek 
    static                          
    {
        System.out.println(2);
    }
    
    // Blok yang pertama diproses setelah memproses method KelasSatu objek dua karena terdapat parameter integer 
    public KelasSatu(int i)         // Parameter
    {
        System.out.println(3);
    }
    
    //Blok yang ketiga diproses karena yang dipanggil adalah KelasSatu tanpa parameter
    public KelasSatu()              // Non Parameter
    {
        System.out.println(4);
    }
}

