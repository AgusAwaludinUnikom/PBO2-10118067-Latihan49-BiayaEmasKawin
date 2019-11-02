/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan49.biayaemaskawin;

/**
 *
 * @author Kiyo
 */
public class EmasKawin {
    private double berat;
    private int hargaPerGram;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHargaPerGram() {
        return hargaPerGram;
    }

    public void setHargaPerGram(int hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }
    
    public double hitungHargaEmas(){
        return berat * hargaPerGram;
    }
}
