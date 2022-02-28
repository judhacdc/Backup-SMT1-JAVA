/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester_1;

import java.util.Scanner;
public class KuisNisakNo1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("----------PROGRAM TANGGAL LAHIR---------------");
         int tanggalsekarang,bulansekarang,tahunsekarang ;
         tanggalsekarang = 31 ;
         bulansekarang = 12 ;
         tahunsekarang = 2016;
         System.out.print("Tanggal seklarang\t\t:"+tanggalsekarang); System.out.print(" - "+bulansekarang); System.out.print(" - "+tahunsekarang); System.out.println("");
         
         
         int tanggallahir,bulanlahir,tahunlahir ;
         System.out.print("Masukan tanggal lahir\t\t:");
         tanggallahir = sc.nextInt () ;
        System.out.print("Masukkan bulan lahir\t\t:");
         bulanlahir = sc.nextInt() ;
         System.out.print("Masukkan tahun lahir\t\t:");
         tahunlahir = sc.nextInt () ;
         System.out.print("Amda lahir pada tanggal\t\t:"+tanggallahir); System.out.print(" - "+bulanlahir); System.out.print(" - "+tahunlahir ); System.out.println(" ");
         //output2
         int totaltanggal,totalbulan,totaltahun ;
         totaltanggal = tanggalsekarang - tanggallahir ;
         totalbulan = bulansekarang - bulanlahir ;
         totaltahun = tahunsekarang - tahunlahir ;
         System.out.print("Jadi usia anda sekarang adalah " +totaltahun);System.out.print(" Tahun "+totalbulan); System.out.print(" Bulan "+totaltanggal); System.out.print(" Hari");
}
}