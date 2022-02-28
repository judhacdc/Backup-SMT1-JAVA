/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;


import java.util.Scanner;
public class UTS_No2_FPB {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int bil1,bil2,r ;
            System.out.print("Masukkan Bilangan Pertama\t\t: ");
            bil1=sc.nextInt();
            System.out.print("Masukkan Bilangan Kedua\t\t\t: ");
            bil2 = sc.nextInt();
            System.out.println();
            
            
    System.out.print("fpb dari "+bil1+" dan "+bil2);
    r = bil2 % bil1;
    while (r != 0) {
        bil1 = bil2;
        bil2 = r;
        r = bil1 % bil2;
    }
        System.out.println(" adalah "+bil2);
   
     
     }
}
// DI BUAT OLEH JUDHA MAYGUSTYA