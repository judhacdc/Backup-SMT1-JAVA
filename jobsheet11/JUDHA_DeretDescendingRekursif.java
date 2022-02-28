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

public class JUDHA_DeretDescendingRekursif {

    // == > Fungsi Main ()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("+=========================================+");
        System.out.println("|              FUNGSI REKURSIF            |");
        System.out.println("+=========================================+");
        System.out.println("   ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ \n");
        System.out.println("[---------TANNPA INPUTAN DARI USER---------]\n");
        System.out.print("▶ ");
        showderet(5);

        System.out.println("\n[---------DENGAN INPUTAN DARI USER---------]");
        System.out.print("Masukkan Jumlah Deret Bilangan : ");
        int bil = sc.nextInt();
        System.out.print("▶ ");showderet(bil);
        System.out.println( );
        // ----------------------------------------------------------- //
        System.out.println("+=========================================+");
        System.out.println("|              FUNGSI INTERATIF            |");
        System.out.println("+=========================================+");
        System.out.println("   ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ \n");
        System.out.println("[---------TANNPA INPUTAN DARI USER---------]\n");
        System.out.print("▶ ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(+i+" ");}
        
        System.out.println("\n[---------DENGAN INPUTAN DARI USER---------]");
        System.out.print("Masukkan Jumlah Deret Bilangan : ");
        int bil2 = sc.nextInt();
        System.out.print("▶ ");
        for (int i = bil2; i >=0; i--) {
            System.out.print(i+" ");
            
        }
    }

    // == > untuk menampilkan deret 
    static void showderet(int x) {
        if (x >= 0) {
            System.out.print(x + " ");
            showderet(x - 1);
        } else {
            System.out.println();
        }

    }
}
