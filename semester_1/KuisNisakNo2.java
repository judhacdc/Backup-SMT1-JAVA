/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester_1;

import java.util.Scanner;
public class KuisNisakNo2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int tanggalsekarang,bulansekarang,tahunsekarang,tanggallahir,bulanlahir,tahunlahir ; 
        System.out.println("===MENGHITUNG UMUR BADU===");
        System.out.print("Masukkan tanggal sekarang\t\t:");
        tanggalsekarang = sc.nextInt () ;
        System.out.print("Masukkan bulan sekarang\t\t\t:"); 
        bulansekarang = sc.nextInt() ;
        System.out.print("Masukkan tahun sekarang\t\t\t:");
        tahunsekarang = sc.nextInt() ;
        System.out.print("Tanggal sekarang\t\t\t"+tanggalsekarang); System.out.print(" - "+bulansekarang); System.out.print(" - "+tahunsekarang);
        System.out.println(" ");
        //---------------------------------------------------------------------------------------------------------------------------------------//
        System.out.print("Masukkan tanggal lahir\t\t\t:");
        tanggallahir = sc.nextInt() ;
        System.out.print("Masukkan bulan lahir\t\t\t:");
        bulanlahir = sc.nextInt();
        System.out.print("Masukkan tahun lahir\t\t\t:");
        tahunlahir = sc.nextInt() ;
        System.out.print("Tangal lahir\t\t\t\t:"+tanggallahir); System.out.print(" - "+bulanlahir); System.out.print(" - "+tahunlahir);
        System.out.println(" ");
        //--------------------------------------------------------------------------------------------------------------------------------------//
        int tanggaltotal,bulantotal,tahuntotal ;
        tanggaltotal = tanggalsekarang - tanggallahir ;
        bulantotal = bulansekarang - bulanlahir ;
        tahuntotal= tahunsekarang - tahunlahir ;
        System.out.print("Umur badu adalah\t\t\t"+tahuntotal); System.out.print(" Tahun "+bulantotal); System.out.print(" Bulan "+tanggaltotal); System.out.println(" Hari");
}
}
