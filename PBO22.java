/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo22;

/**
 *
 * @author taufi
 */
public class PBO22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char karakterA = 'A';
        char karakterB = 'B';

        int kodeAsciiA = (int) karakterA; // Mendapatkan kode ASCII dari karakter 'A'
        int kodeAsciiB = (int) karakterB; // Mendapatkan kode ASCII dari karakter 'B'

        int jumlahKodeAscii = kodeAsciiA + kodeAsciiB; // Menjumlahkan kode ASCII

        System.out.println("Kode ASCII dari karakter 'A' adalah: " + kodeAsciiA);
        System.out.println("Kode ASCII dari karakter 'B' adalah: " + kodeAsciiB);
        System.out.println("Jumlah kode ASCII dari 'A' dan 'B' adalah: " + jumlahKodeAscii);
    }
}
