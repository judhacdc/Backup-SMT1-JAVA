/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int baris;

        System.out.print("Masukan Jumlah baris yang di inginkan : ");
        baris = sc.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = baris; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Code By Judha Maygustya