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
public class TestBarang {
    public static void main(String[]args){
        Barang brg1 = new Barang();
        Barang brg2 = new Barang();
        
        
        brg1.setBarang("VALORANT Mousepad");
        brg1.setKode("RIOT");
        brg1.setHarga(170000);
        brg1.setDiskon(15);
        brg1.setHargaJual();
        brg1.tampilBarang();
        
        System.out.println("");
        System.out.println("====== BARANG LAINNYA =====");
        System.out.println("");
        
        brg2.setBarang("FORSAKEN SKIN");
        brg2.setKode("FORSAKEN");
        brg2.setHarga(750000);
        brg2.setDiskon(10);
        brg2.setHargaJual();
        brg2.tampilBarang();
    }
}
