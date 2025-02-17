/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo21;

/**
 *
 * @author taufi
 */
public class PBO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rangking = 1; // Ganti dengan peringkat siswa yang sebenarnya
        boolean naikKelas = true; // Ganti dengan status kenaikan kelas siswa yang sebenarnya

        if ((rangking == 1) && (naikKelas)) {
            System.out.println("Selamat! Anda mendapatkan hadiah karena menjadi juara kelas dan naik kelas!");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat untuk mendapatkan hadiah.");
        }
    }
}
