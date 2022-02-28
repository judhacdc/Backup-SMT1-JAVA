/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

class Judha_Prak6 {
       // Fungsi hitungLuas

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    // Fungsi hitungVolume
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukka panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan Leher : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas (p,l);
        System.out.println("Luas Persegi panjang adalah " + L);

        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);

    }
}
