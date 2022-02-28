/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

public class Jobsheet10_No4 {

    private static void nilai_arek_arek(int nilai[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai Mahasisawa ke " + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
    }

    private static float rata(int nilai[]) {
        int total = 0;
        float rata = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
            rata = total / nilai.length;

        }
        return rata;
    }

    private static int terbesar(int nilai[]) {
        int terbesar = 0;
        terbesar = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
        }
        return terbesar;
    }

    private static int terkecil(int nilai[]) {
        int terkecil = 0;
        terkecil = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }
        return terkecil;
    }

    public static void main(String[] args) {
        int nilai[] = new int[10];

        nilai_arek_arek(nilai);

        float rata = rata(nilai);
        int terbesar = terbesar(nilai);
        int terkecil = terkecil(nilai);

        System.out.println("Rata-Rata Nilai Mahasiwa yakni : " + rata);
        System.out.println("Nilai Terkecil Mahasiswa yakni : " + terkecil);
        System.out.println("Nilai Terbesar Mahasiswa yakni : " + terbesar);
    }
}
