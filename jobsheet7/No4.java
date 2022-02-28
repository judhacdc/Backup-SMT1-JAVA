/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;


import java.util.Scanner;

public class No4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int baris;

        System.out.print("Masukan N : ");
        baris = sc.nextInt();

        int i = 0;
        do{
            int j = 1, k = baris;
            do {
                if (i % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print(k);
                }
                j++;
                k--;
            } while (j <= baris);
            i++;
            System.out.println();
        } while (i < baris);
    }
}
//Code By Judha Maygustya