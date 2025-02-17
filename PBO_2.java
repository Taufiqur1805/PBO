/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_2;

import java.util.Scanner;

/**
 *
 * @author taufi
 */
public class PBO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan tiga bilangan pecahan
        System.out.print("Masukkan bilangan pecahan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan bilangan pecahan kedua: ");
        double bilangan2 = input.nextDouble();

        System.out.print("Masukkan bilangan pecahan ketiga: ");
        double bilangan3 = input.nextDouble();

        // Melakukan operasi aritmatika
        double hasilPenjumlahan = bilangan1 + bilangan2 + bilangan3;
        double hasilPengurangan = bilangan1 - bilangan2 - bilangan3;
        double hasilPerkalian = bilangan1 * bilangan2 * bilangan3;
        double hasilPembagian = bilangan1 / bilangan2 / bilangan3;

        // Menampilkan hasil operasi
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        System.out.println("Hasil pembagian: " + hasilPembagian);

        // Menutup objek Scanner
        input.close();
    }
}