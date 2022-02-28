/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class kuis2soal2_JudhaMaygustya {

    public static void main(String[] args) {
          //Judha Maygustya
        //TI E / 15

        Scanner userInput = new Scanner(System.in);
        int[][] judha = new int[5][4];
        String[] nama = new String[5];
        // aturan
        System.out.println("INPUT BERDASARKAN URUTAN NILAI YANG TERTERA");
        System.out.println("1. Nilai Tugas"
                + "\n2. Nilai Kuis"
                + "\n3. Nilai UTS"
                + "\n4. Nilai UAS");
// pengisian nama dan nilai
        for (int j = 0; j < 5; j++) {
            System.out.printf("Masukan nama mahasiswa ke-%d : ", (j + 1));
            nama[j] = userInput.nextLine();
            for (int u = 0; u < 4; u++) {
                System.out.printf("Masukan nilai ke-%d : ", (u + 1));
                judha[j][u] = userInput.nextInt();
                userInput.nextLine();
            }
            System.out.println();
        }
// menghitung total
        
        float[] rata = new float[5];
        for (int j = 0; j < 5; j++) {
            for (int u = 0; u < 4; u++) {
                rata[j] += judha[j][u];
            }
        }
// proses hitung
        
        for (int j = 0; j < 5; j++) {
            System.out.printf("Rata-rata mahasiswa dengan nama %s adalah %.2f\n", nama[j], (rata[j] / 4));
        }
        System.out.println(" By Judha - Kuis 2");
    }

}
// Code BY JUDHA MAYGUSTYA
