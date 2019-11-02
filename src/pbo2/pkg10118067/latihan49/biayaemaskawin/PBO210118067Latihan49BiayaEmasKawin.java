/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan49.biayaemaskawin;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : PBO2
 * NIM      : 10118067
 * Latihan ini berisi tentang bagaimana menghitung harga emas kawin dari
 * harga emas yang sudah ditentukan
 */
public class PBO210118067Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmasKawin ek = new EmasKawin();
        ek.setHargaPerGram(570000);
        ek.setBerat(15.7);
        
        System.out.println("========Hitung Harga Emas Kawin========\n");
        System.out.println("Harga Emas Per Satu Gram : Rp. " + 
                ek.getHargaPerGram());
        System.out.println("Berat Emas yang akan dibeli : " + ek.getBerat() 
                + " gram");
        System.out.println("Total bayar : Rp. " + ek.hitungHargaEmas());
        
        
        
        
    }
    
}
