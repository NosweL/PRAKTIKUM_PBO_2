/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author welso
 */
public class Lingkaran {

    double r, luas, keliling, phi = 3.14;

    public Lingkaran(double jari, double p) {
        r = jari;
        phi = p;
    }

    public double hitungLuas() {
        luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 * phi * r;
        return keliling;
    }

    public void tampilLingkaran() {
        System.out.println("r       : " + r);
        System.out.println("Phi     : " + phi);
        System.out.println(" LUAS DAN KELILING");
        System.out.println("LUAS    : " + luas);
        System.out.println("KELILING: " + keliling);

    }
}
