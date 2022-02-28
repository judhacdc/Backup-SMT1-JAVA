/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;


import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

       // Judha Maygustya
        // TI 1E // 15
        int nilai [] = new int [4];
        String nama [] = new String [5] ;
        
        System.out.println("");
        System.out.println("1. Nilai Tugas"
                + "\n2. Nilai Kuis"
                + "\n3. Nilai UTS"
                + "\n4. Nilai UAS");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan Nilai anda Berdasarkan Urutan : ");
            nilai [i] = sc.nextInt();
        }
    }
}
