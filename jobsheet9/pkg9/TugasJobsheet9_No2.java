/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class TugasJobsheet9_No2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris \t\t : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom \t\t : ");
        int kolom = input.nextInt();

        //======== PENGISIAN VARIABLE ==================== //       
        int judha[][] = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan Nilai ke [" + i + "] [" + j + "] : ");
                judha[i][j] = input.nextInt();
            }

        }
        // ======== Pilihan Menu =========== //
        System.out.println(" ");
        System.out.println("==== PILIHAN MENU ====");
        System.out.println("A. Nilai MIN");
        System.out.println("B. Nilai MIN & Jumlahnya");
        System.out.println("C. Kondisi Array");
        System.out.println(" ");
        System.out.print("Masukkan Pilihan (A,B,C) \t: ");
        String pilihan = sc.nextLine();

        // ========== Menu 1 ========== //
        int min;

        switch (pilihan) {
            case "A": {
                min = judha[0][0];
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] < min) {
                            min = judha[i][j];
                        }
                    }
                }
                System.out.println("Nilai Min/Terkecil Yakni\t : " + min);
                break;
            }
            case "a": {
                min = judha[0][0];
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] < min) {
                            min = judha[i][j];
                        }
                    }
                }
                System.out.println("Nilai Min/Terkecil Yakni\t : " + min);
                break;
            }
            case "B":
                // Terkecil B//
                min = judha[0][0];
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] < min) {
                            min = judha[i][j];
                        }
                    }
                }
                // Jumlah B//
                int x = 0;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] == min) {

                            x++;
                        }
                    }
                }
                System.out.println("Nilai Ter Kecil Yakni " + min + " Jumlah Nilai Terkecil " + x);
                break;

            case "b":
                // Terkecil b//
                min = judha[0][0];
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] < min) {
                            min = judha[i][j];
                        }
                    }
                }
                // Jumlah b//
                x = 0;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (judha[i][j] == min) {

                            x++;
                        }
                    }
                }
                System.out.println("Nilai Ter Kecil Yakni " + min + " Jumlah Nilai Terkecil " + x);
                // Lokasi //
                int lokasi = 0;

                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (min == judha[i][j]) {
                            System.out.println("Terletak di : [" + i + "] [" + j + "]");

                        }
                    }

                }
                break;
            // Kondisi Array C//
            case "C":
                String status = "";

                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        if (judha[i][j] == 50) {
                            status = "ADA";

                        } else {
                            status = "TIDAK ADA";
                        }
                    }
                }
                System.out.println(status);

        // Kondisi c //
            case "c":
                status = "";

                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {

                        if (judha[i][j] == 50) {
                            status = "ADA";

                        } else {
                            status = "TIDAK ADA";
                        }
                    }
                }
                System.out.println(status);

        }
    }
}
// Code BY Judha Maygustya