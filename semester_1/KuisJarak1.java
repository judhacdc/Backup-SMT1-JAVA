/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester_1;

import java.util.Scanner;
public class KuisJarak1 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         float waktu ;
         int kecepatan,totaljarak ;
         waktu = 1.5F ;
         kecepatan = 60 ;
         
         System.out.print("Kecepatan mobil pak Oga\t\t\t:"+kecepatan); System.out.print(" Km/jam\n");
         System.out.print("Waktu yang di perlukan yakni\t\t:"+waktu); System.out.print(" Jam\n");
         totaljarak = (int) (kecepatan/waktu) ;
         System.out.println("Jarak polinema ke lokasi kerja sejauh\t:"+totaljarak);
         
}
}