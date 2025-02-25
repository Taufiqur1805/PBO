/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo3;
import java.util.Scanner;

/**
 *
 * @author taufi
 */
public class PBO3 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menerima 3 buah integer sebagai masukan
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bilangan3 = input.nextInt();

        // Memeriksa apakah masing-masing bilangan adalah ribuan
        if (isRibuan(bilangan1)) {
            System.out.println(bilangan1 + " adalah bilangan ribuan.");
        } else {
            System.out.println(bilangan1 + " bukan bilangan ribuan.");
        }

        if (isRibuan(bilangan2)) {
            System.out.println(bilangan2 + " adalah bilangan ribuan.");
        } else {
            System.out.println(bilangan2 + " bukan bilangan ribuan.");
        }

        if (isRibuan(bilangan3)) {
            System.out.println(bilangan3 + " adalah bilangan ribuan.");
        } else {
            System.out.println(bilangan3 + " bukan bilangan ribuan.");
        }

        // Menutup objek Scanner
        input.close();
    }

    // Method untuk memeriksa apakah suatu bilangan adalah ribuan
    public static boolean isRibuan(int bilangan) {
        return bilangan >= 1000 && bilangan <= 9999;
    }
}
