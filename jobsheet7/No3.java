/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;


import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int baris;

        System.out.print("Masukan baris : ");
        baris = sc.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris; j++) {
                if (!((i == 0) || (i == baris - 1))){
                    if ((j == 0) || (j == baris - 1)) {
                        System.out.print(baris + " ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(baris + " ");
                }
            }
            System.out.println();
        }
    }
}
//Code By Judha Maygustya