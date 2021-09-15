/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author welso
 */
public class Barang {
    public String kode, namaBarang;
    public int hargaDasar, diskon, hargaJual;
    
    
    public void setKode(String newValue){
        kode=newValue;
    }
    
    public void setBarang(String newValue){
        namaBarang = newValue;
    }
    
    public int setHarga(int newValue){
        hargaDasar = newValue;
        return hargaDasar;
    }
    public int setDiskon(int newValue){
        diskon = newValue;
        return diskon;
    }
    
    public int setHargaJual(){
        hargaJual = hargaDasar -(hargaDasar *diskon/100);
        return hargaJual;
    }
    public void tampilBarang(){
        System.out.println("KODE BARANG = "+kode);
        System.out.println("NAMA BARANG = "+namaBarang);
        System.out.println("HARGA DASAR = "+hargaDasar);
        System.out.println("DISKON      = "+diskon+ "%");
        System.out.println("HARGA JUAL  = "+hargaJual);
    }
}
