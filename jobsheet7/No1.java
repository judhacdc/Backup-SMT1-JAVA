/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int baris;

        System.out.print("Masukan Baris : ");
        baris = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = baris, sgtg = 1; j >= 1; j--) {
                if (i == j) {
                    System.out.print(sgtg + " ");
                } else if (i > j){
                    ++sgtg;
                    System.out.print(sgtg + " ");
                }  else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
//Code By Judha Maygustya