/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class Pengayaan_1 {
      public static void main(String[] args) { 
          Scanner input = new Scanner(System.in);
          int jumlah; int hasil=0; int key;
          
          System.out.print("Masukkan Jumlah elemen Array : ");
          jumlah = input.nextInt();
          int judha []  = new int [jumlah];
          
          for (int i=0;i<judha.length;i++){
              System.out.print("Array ke-"+i+" : ");
          judha [i]=input.nextInt();}
            
          System.out.print("Masukkan Key Yang di cari  : ");
         key = input.nextInt();
          //====================== PROSES ===================//
          for (int i=0;i<judha.length;i++){
          if (key==judha[i]){
          hasil=i;
          break;
          }}       
          System.out.print("Terdapat di posisi index ke : "+hasil);
          
}
}
//Code By Judha Maygustya