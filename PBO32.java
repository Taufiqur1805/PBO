/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo32;
import java.util.Scanner;
/**
 *
 * @author taufi
 */
public class PBO32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam masuk (1-12): ");
        int jamMasuk = input.nextInt();

        System.out.print("Jam keluar (1-12): ");
        int jamKeluar = input.nextInt();

        // Menangani kasus jika jam keluar lebih kecil dari jam masuk (parkir melewati tengah malam)
        int lamaParkir;
        if (jamKeluar < jamMasuk) {
            lamaParkir = (12 - jamMasuk) + jamKeluar;
        } else {
            lamaParkir = jamKeluar - jamMasuk;
        }

        int biayaParkir;

        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: Rp " + biayaParkir);

        input.close();
    }
}
