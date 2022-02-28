/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_pertemuan5;

import java.util.Scanner;
public class Percobaan3 {
    
       public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int umur ;
           System.out.println("Masukkan umur anda\t\t");
           umur = sc.nextInt () ;
           
           if (umur >60){
               System.out.println("Lansia");}
           else if (umur>45){
               System.out.println("Tua");}
           else if (umur>17) {
               System.out.println("Dewasa");}
           else if (umur >5){
               System.out.println("Anak-anak");}
           else {
               System.out.println("Balita");}
    
}
}