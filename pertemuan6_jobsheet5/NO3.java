/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_jobsheet5;

import java.util.Scanner;
public class NO3 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String makanan ;
       int hargamakanan,pengiriman ;
       int z,x,c,v ;
       z = 20000; c=45000 ;
       x = 30000; v=55000 ;
       
         System.out.print("Masukkan nama makanan\t\t: ");
         makanan = sc.nextLine () ;
         System.out.print("Masukkan Harga makanan\t\t: ");
         hargamakanan = sc.nextInt() ;
         System.out.println("Apakah anda ingin menggunakan pengiriman eksprers (0=tidak,1= ya) ?");
         pengiriman = sc.nextInt();
         System.out.println("STRUK PEMBELIAN");
         System.out.print(""+makanan); System.out.print("\t\t\t:Rp."+hargamakanan);
         System.out.println(" ");
         if (pengiriman==0){
             if (hargamakanan<100000)
             System.out.println("Biyaya Pengiriman\t\t\t:Rp."+z);
             else if (hargamakanan>100000) {
                 System.out.println("Biyaya Pengiriman\t\t\t:Rp."+x);}
         if (pengiriman == 1){
             if (hargamakanan <100000) {
                 System.out.println("Biyaya pengiriman\t\t\t:Rp."+c);}
             else if (hargamakanan>100000) {
                 System.out.println("Biyaya pengiriman\t\t\t:Rp."+v); }
         }
         }   
         
        int z1 = z+hargamakanan; int x1=x+hargamakanan ; int c1= c+hargamakanan;int v1 = v+hargamakanan ;
            if (pengiriman==0){
         if (hargamakanan<100000){        
             System.out.println("TOTAL\t\t\t\t:Rp."+z1);}
             else if (hargamakanan>100000) {
                 System.out.println("TOTAL\t\t\t:Rp."+x1);} 
            if (pengiriman == 1){
             if (hargamakanan <100000) {
                 System.out.println("Total\t\t\t\t:Rp."+c1);}
             else if (hargamakanan>100000) {
                 System.out.println("TOTAL\t\t\t\t:Rp."+v1); }
}         
}        
}
}
     
             
     
