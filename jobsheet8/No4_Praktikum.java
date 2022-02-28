/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class No4_Praktikum {
    public static void main(String[] args) {     
    Scanner input = new Scanner(System.in);
       
    int jumlaharray;
   
    
        System.out.print("Masukkan Jumlah Array : ");
        jumlaharray = input.nextInt();
         int judha []  = new int [jumlaharray];
         
        for (int i=0;i<jumlaharray;i++){
            System.out.print("Masukkan Array ke-"+i+" : ");
        judha [i]=input.nextInt();}
        
       
         for (int i=0;i<judha.length;i++){
       if (judha[i]%2==0){
           System.out.println("Angka Genap  : "+judha[i]);}
        }
         
          for (int i=0;i<judha.length;i++){
       if (judha[i]%2==1){
           System.out.println("Angka Ganjil : "+judha[i]);}
        }
}
}
//Code By Judha Maygustya