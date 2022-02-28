/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class JUDHA_PenjumlahanRekursif {

    static int penjumlahan(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + penjumlahan(x - 1);
        }
    }

    public static void main(String[] args) {
        do {
        Scanner input = new Scanner(System.in);
        System.out.println("======================================================================");
        System.out.println("\t\t\t PROGRAM MEGHITUNG FAKTORIAL \t\t");
        System.out.println("======================================================================\n");

        System.out.print("Masukkan Bilangan yang ingin di faktorialkan : ");
        int bil = input.nextInt();
        System.out.println("Hasil dari faktorial bilangan " + bil + " adalah =>      " + penjumlahan(bil));
            System.out.println();
        }
        while (true);
    }
}
