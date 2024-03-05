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
public class polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //produk (nama, stok, kode)
        produk produk1 = new produk("Furnitur", 7, 5);
        produk1.cetakInfoProduk();
        produk1.tambahStok();
        produk1.tambahStok(5);
        produk1.kurangStok(6);
        
        //makanan input(nama produk, stok, nama makanan, harga)
        makanan makanan1 = new makanan("Makanan", 7, "Jagung bakar", 10000);
        
        //minuman input(nama produk, stok, nama minuman, harga)
        minuman minuman1 = new minuman("Minuman", 5, "Kopi", 15000);
        
        makanan1.getkodeProduk();
        makanan1.cetakInfoProduk();
        minuman1.getkodeProduk();
        minuman1.cetakInfoProduk();
    } 
}
