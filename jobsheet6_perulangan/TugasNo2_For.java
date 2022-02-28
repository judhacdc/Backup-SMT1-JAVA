/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6_perulangan;

import java.util.Scanner;
public class TugasNo2_For {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int range,x,i,total ;
      float ratarata ;
      
         System.out.print("Masukkan Angka : ");
         range = sc.nextInt() ;
         x = 1;
         i = range/2 ;
         System.out.print("Banyaknya Bilangan Genap dari "+x); System.out.print(" Sampai "+range); System.out.print(" Adalah "+i);
         System.out.println("");
        
         i = 0 ;
        total = 0 ;
        for (x=1; x<=range ;x++){ 
        if (x%2==0){
            System.out.printf ("Bilangan genap ke- %d adalah %d \n",++i,x);
        total +=x; }}
        
        ratarata = total/i;
        i =1;
         System.out.print("Jumlah bilangan Genap dari "+i); System.out.print(" Sampai "+range); System.out.print(" = "+total);
         System.out.println("");
         System.out.print("Rata -  Rata bilangan Genap dari"+i); System.out.print(" Sampai "+range); System.out.print(" = "+ratarata);
         
}
}
