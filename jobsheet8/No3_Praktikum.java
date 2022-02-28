/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class No3_Praktikum {
     public static void main(String[] args) {     
    Scanner input = new Scanner(System.in);
int isi,terbesar;

         System.out.print("Masukkan isi Array : ");
         isi = input.nextInt();
         int judha [] = new int [isi];
         
         for (int i=0;i<isi;i++){
             System.out.print("Masukkan Elemen Array ke-"+i+" : ");
          judha [i] = input.nextInt();}
         
         terbesar= judha[0];
         for (int j=0;j<isi;j++){
         if (judha[j]>terbesar){
                terbesar=judha[j];}
         }
         System.out.println("Bilangan Tervesar : "+terbesar);
     }
}
//Code By Judha Maygustya