/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

import java.util.Scanner;

public class TugasJobsheet9_No3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int judha[][] = new int[3][5];
        System.out.println(" ====== INPUT NILAI MATRIKS ======\n");
        for (int i = 0; i < judha.length; i++) {
            for (int j = 0; j < judha[0].length; j++) {
                System.out.print("Masukkan Nilai ke [" + i + "] [" + j + "] :");
                judha[i][j] = input.nextInt();
            }
        }

        System.out.println("\n ======= TAMPILAN MATRIKS =======");
        for (int i = 0; i < judha.length; i++) {
            for (int j = 0; j < judha[0].length; j++) {
                System.out.println("[" + i + "] [" + j + "] : " + judha[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    
        //Baris Terbesar //
        for (int i = 0; i < judha.length; i++) {
            int terbesar = 0;
            for (int j = 0; j < judha[0].length; j++) {
                if (judha[i][j] > terbesar) {
                    terbesar = judha[i][j];
                }
            }
            System.out.println("Bilangan Terbesar di Baris  [" + i + "] = " + terbesar);
        }
        System.out.println(" ");
        System.out.println(" ");
        //Kolom Terbesar //
        for (int i = 0; i < judha[0].length; i++) {
            int terbesar = 0;
            for (int j = 0; j < judha.length; j++) {
                 if (judha[j][i]>terbesar){
                 terbesar = judha[j][i];}
            }
            System.out.println("Bilangan Terbesar di Kolom  [" + i + "] = " + terbesar);
        }

    }
}
// Code BY Judha Maygustya