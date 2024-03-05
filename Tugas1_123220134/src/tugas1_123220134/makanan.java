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
class makanan extends produk {
    //atribut
    public String namaMakanan;
    public int hargaMakanan;
    
    //constructor
    public makanan (String namaProduk, int stokProduk, String namaMakanan, int hargaMakanan){
        super(namaProduk, stokProduk);
        setkodeProduk(10);
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }
    
    //overriding
    @Override
    public void cetakInfoProduk(){
        super.cetakInfoProduk();
        System.out.println("Nama Makanan : " + this.namaMakanan + "\nHarga Makanan : " + this.hargaMakanan);
    }
}