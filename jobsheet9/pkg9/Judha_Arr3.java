/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

import java.util.Scanner;
public class Judha_Arr3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int kolom,baris;
        
         
         System.out.print("Masukkan Jumlah Kolom : ");
         kolom = input.nextInt();
         System.out.print("Masukkan Jumlah Baris : ");
         baris = input.nextInt();
          int [][] nilai = new int [baris][kolom];
          
         for (int i=0;i<baris;i++){
       for (int j=0;j<kolom;j++){
           System.out.print("Masukkan nilai ke-["+i+"]["+j+"] : ");
       nilai[i][j]=input.nextInt();
       }  
             System.out.println("-------------------------------------");
         }
      
         
       for (int array1D[]:nilai){
       for (int j: array1D){
           System.out.print(j+" ");}
           System.out.println();} 

         
       
         
}
}