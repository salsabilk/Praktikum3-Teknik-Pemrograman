/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-31
 */

public class Barang {
    // Deklarasi Variabel
    String kode_barang;
    String nama_barang;
    private int stok;           // Mengganti access modifier variabel stok menjadi private.
    
    // Constructor Barang
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    // Membuat method getter stok untuk mendapatkan nilai dari variabel stok.
    public int getStok() {
      return stok;              // Mengembalikan nilai stok
    }
    
    // Membuat method setter stok untuk memasukkan nilai variabel stok.
    public void setStok(int stok) {
      this.stok = this.stok + stok;     // Untuk melakukan perhitungan stok, maka tambahkan operasi aritmatika penjumlahan.
                                        // Kalkulasinya yaitu jumlah stok awal barang dan jumlah barang baru. 
    }

}
