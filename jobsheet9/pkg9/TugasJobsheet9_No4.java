/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

import java.util.Scanner;

public class TugasJobsheet9_No4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kolombangku, baris;
        System.out.print("Masukkan Jumlah Baris  \t\t: ");
        baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom Bangku    : ");
        kolombangku = input.nextInt();
        System.out.println(" ");
        String nama[][] = new String[baris][kolombangku];
        int nilai[][] = new int[baris][kolombangku];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolombangku; j++) {
                System.out.print("Masukkan Nama dari [" + i + "]-[" + j + "] = ");
                input.nextLine();
                nama[i][j] = input.nextLine();
                System.out.print("Masukkan Nilai dari [" + i + "]-[" + j + "] = ");
                nilai[i][j] = input.nextInt();
                System.out.println();
            }
        }
        System.out.println("============== MENAMPILKAN NAMA =========== ");
        // Menampilkan Nama Mahasiswa 
        for (String judha[] : nama) {
            for (String j : judha) {
                System.out.print(j + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("============== MENAMPILKAN NILAI =========== ");
        // Menampilkan Nilai 

        for (int maygustya[] : nilai) {
            for (int x : maygustya) {
                System.out.print(x + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("=============NILAI  YANG SERING MUNCUL UNTUK BARISAN PALING DEPAN & NAMA NYA=============");

        int opoyo = 0, opoiki = 0, judha;

        for (int i = 0; i < kolombangku; i++) {
            int modus = 0;
            for (int j = 0; j < kolombangku; j++) {
                if (nilai[0][j] == nilai[0][i]) {
                    ++modus;
                }
            }
            if (modus > opoiki) {
                opoiki = modus;
                opoyo = nilai[0][i];

            }
        }
        System.out.println("Modus : " + opoyo);

        // nama yang memiliki 
        for (int i = 0; i < kolombangku; i++) {
            if (nilai[0][i] == opoyo) {
                System.out.println("Nama Yang memiliki nilai tersebut : " + nama[0][i]);
            }
        }

        // nilai tertinggi terendah dan yang memilikinya
        for (int i = 0; i < baris; i++) {
            int terbesar = nilai[i][0];
            int terkecil = nilai[i][0];
            for (int j = 0; j < kolombangku; j++) {
                if (nilai[i][j] > terbesar) {
                    terbesar = nilai[i][j];
                } else if (nilai[i][j] < terkecil) {
                    terkecil = nilai[i][j];
                }
            }
            
            
            System.out.println("Nilai Terbesar pada baris ["+i+"] = "+terbesar);
            System.out.println("Nilai Terkecil pada baris ["+i+"] = "+terkecil);
        }
    }
}
// Code BY Judha Maygustya
