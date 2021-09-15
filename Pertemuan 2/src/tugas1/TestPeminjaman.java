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
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        
        pj1.setNamaWarnet("RECCA ESPORT ARENA");
        pj1.setId(01);
        pj1.setNama("Welson Mario Naibaho");
        pj1.setMember("welson");
        pj1.setNamaGame("Valorant");
        pj1.setHarga(112500);
        pj1.setDurasiSewa(2);
        pj1.TotalBayar(112500, 2);
        pj1.tampilData();
    }
}
