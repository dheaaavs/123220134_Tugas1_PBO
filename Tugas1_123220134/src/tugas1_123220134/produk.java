/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_123220134;

/**
 *
 * @author Win 10
 */
public class produk {
    //atribut
    public String namaProduk;
    public int stokProduk;
    private int kodeProduk;
    
    
    //constructor
    //overload
    produk (String namaProduk, int stokProduk) {
        this.namaProduk = namaProduk;
        this.stokProduk = stokProduk;
    }
    produk (String namaProduk, int stokProduk, int kodeProduk) {
        this.namaProduk = namaProduk;
        this.stokProduk = stokProduk;
        this.kodeProduk = kodeProduk;
    }
    
    //method
    //overloading
    public void tambahStok(){
        stokProduk += 1;
        System.out.println("Stok produk berhasil ditambah" + "\nTotal :" + stokProduk);
    }
    public void tambahStok(int jmlTambah){
        stokProduk+= jmlTambah;
        System.out.println("Stok produk berhasil ditambah" + "\nTotal :" + stokProduk);
    }
    
    public void kurangStok(){
        stokProduk -= 1;
        System.out.println("Stok produk berhasil dikurang" + "\nTotal :" + stokProduk);
    }
    public void kurangStok(int jmlKurang){
        stokProduk -= jmlKurang;
        System.out.println("Stok produk berhasil dikurang" + "\nTotal :" + stokProduk);
    }
    
    public void cetakInfoProduk(){
        System.out.println("\nNama Produk : " + namaProduk + "\nKode Produk : " + kodeProduk + "\nStok Produk : " + stokProduk);
    }
    
    //setter dan getter
    public void setkodeProduk(int kodeProduk) {
        this.kodeProduk = kodeProduk;
    }
    
    public int getkodeProduk(){
        return this.kodeProduk;
    }
}
