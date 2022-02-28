/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

public class Jobsheet10_No3 {

    // untuk input nilai
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

    public static void main(String[] args) {
        int nilai[] = new int[10];

        nilai_arek_arek(nilai);

        float rata = rata(nilai);

        System.out.println("Rata-Rata Nilai Mahasiwa yakni : " + rata);
    }

}
