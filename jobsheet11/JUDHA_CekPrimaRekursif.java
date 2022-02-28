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

public class JUDHA_CekPrimaRekursif {

    static int n;

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("+=========================================+");
            System.out.println("|          MENGECEK BILANGAN PRIMA        |");
            System.out.println("+=========================================+\n");
            System.out.print("Masukkan Bilangan Yang Ingin di cek ==> ");
            n = sc.nextInt();
            if (n > 1) {
                int p = cekbilprima(n - 1);
                if (p == 1) {
                    System.out.println(n + " MERUPAKAN BILANGAN PRIMA");
                } else {
                    System.out.println(n + " BUKAN BILANGAN PRIMA");
                }
            } else {
                System.out.println(n + " BUKAN BILANGAN PRIMA");
            }
        } while (true);
    }

    static int cekbilprima(int judha) {
        if (judha == 1) {
            return 1;
        } else if (n % judha == 0) {
            return 0;
        } else {
            return cekbilprima(judha - 1);
        }
    }
}
