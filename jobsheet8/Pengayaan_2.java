/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class Pengayaan_2 {
    
     public static void main(String[] args) { 
          Scanner input = new Scanner(System.in);
    int jumlah;
    
          System.out.print("Masukkan Jumlah elemen Array : ");
          jumlah = input.nextInt();
          int judha []  = new int [jumlah];
          int temp=0; 
          
          for (int i=0;i<judha.length;i++){
              System.out.print("Array ke-"+i+" : ");
          judha [i]=input.nextInt();}
          //================================//
          for (int i=0;i<judha.length;i++){
          for (int j=1;j<judha.length-1;j++){
          if (judha[j-1]>judha[j]){
          temp=judha[j-1];
          judha[j-1]=judha[j];
          judha[j]=temp;
          }
            }          
              }
          System.out.print("Hasil Pengurutan : ");
                  for (int i=0;i<judha.length;i++){
                      System.out.print(judha[i]+" ");}
          
}
}
//Code By Judha Maygustya