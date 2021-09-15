/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author welso
 */
public class Peminjaman {
    
    public String nama;
    public String member;
    public String namaGame;
    public String namaWarnet;
    
    public int id;
    public int durasiSewa;
    public int harga;
    public int totalbayar;
    
    public void setNamaWarnet(String newValue){
        namaWarnet = newValue;
    }
    
    public void setId(int newValue){
        id = newValue;
    }
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setMember(String newValue){
        member = newValue;
    }
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
    public int setHarga(int newValue){
       harga = newValue;
       return harga;
    }
    public int setDurasiSewa(int newValue){
       durasiSewa = newValue;
       return durasiSewa;
    }
    public int TotalBayar(int harga, int durasiSewa){
        totalbayar = harga*durasiSewa;
        return harga;
    }
    public void tampilData(){
        System.out.println("===== private =====");
        
        System.out.println("NAMA WARNET  : " +namaWarnet);
        System.out.println("ID           : " +id);
        System.out.println("NAMA         : " +nama);
        System.out.println("MEMBER       : " +member);
        
        System.out.println("===== internal =====");
        
        System.out.println("NAMA GAME    : " +namaGame);
        System.out.println("HARGA        : " +harga);
        System.out.println("Durasi Sewa  : " +durasiSewa +" Hari");
        
        System.out.println("===== Total Harga Sewa Yang Harus Dibayar ======");
        
        System.out.println("Harga Total : " +totalbayar);
    }
    
    
}
