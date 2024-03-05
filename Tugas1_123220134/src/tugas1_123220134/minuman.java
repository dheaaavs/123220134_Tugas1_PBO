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
public class minuman extends produk {
    //atribut
    public String namaMinuman;
    public int hargaMinuman;
    
    //constructor
    public minuman (String namaProduk, int stokProduk, String namaMinuman,  int hargaMinuman){
        super(namaProduk, stokProduk);
        setkodeProduk(17);
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
    }
    
    //overriding
    @Override
    public void cetakInfoProduk(){
        super.cetakInfoProduk();
        System.out.println("Nama Minuman : " + this.namaMinuman +"\nHarga Minuman : " + this.hargaMinuman);
    }
}
