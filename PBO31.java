/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo31;
import java.util.Scanner;
/**
 *
 * @author taufi
 */
public class PBO31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta masukan tiga angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();

        // Mencari nilai terbesar
        int terbesar = angka1; // Asumsikan angka1 adalah yang terbesar

        if (angka2 > terbesar) {
            terbesar = angka2;
        }

        if (angka3 > terbesar) {
            terbesar = angka3;
        }

        // Menampilkan nilai terbesar
        System.out.println("Nilai terbesar adalah: " + terbesar);

        input.close();
    }
}
