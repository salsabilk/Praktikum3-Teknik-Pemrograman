/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventori;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-31
 */

public class Inventori {
    Barang[] barangs;
    
    // Mendefinisikan objek barang yang terdiri dari kode, nama, dan stok awal barang.
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    // Membuat method showBarang untuk menampilkan nama dan jumlah stok barang.
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "{" + barangs[0].getStok() + "}");
        System.out.println(barangs[1].nama_barang + "{" + barangs[1].getStok() + "}");
    }
    
    // Membuat method pengadaan untuk proses manipulasi jumlah stok barang
    void pengadaan(){
        initBarang();
        
        barangs[0].setStok(20);     // Pada barang index ke 0, menambahkan stok sebanyak 20
        barangs[1].setStok(40);     // Pada barang index ke 1, menambahkan stok sebanyak 40
        //barangs[0].stok -= 30;    // Bisa juga dikurangi dong?
        //barangs[1].stok *= 30;    // Dikali juga bisa dong?
        showBarang();                   // Memanggil method showBarang
    }
    
    // Main class untuk membuat pengadaan barang atau menambah stok
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();               
    }
   
}
