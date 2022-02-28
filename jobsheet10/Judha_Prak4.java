/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

class Judha_Prak4 {

    static int Kali(int C, int D) {
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }

    static int Kurang(int A, int B) {
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }

    static int cek(int nilaipertama, int nilaikedua) {
        if (nilaipertama >= 0) {
            System.out.println("Nilai Memenuhi syarat");
        } else {
            System.out.println("Nilai Tidak Memenuhi syarat");
        }
        if (nilaikedua >= 0) {
            System.out.println("Nilai Memenuhi syarat");
        } else {
            System.out.println("Nilai Tidak Memenuhi syarat");
        }
        return (nilaipertama | nilaikedua);
    }

    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.println("Masukkan Nilai 2 : ");
        nilai2 = input.nextInt();

        cek(nilai1, nilai2);

        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah " + hasil);
    }
}
