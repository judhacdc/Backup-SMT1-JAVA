/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;


public class No1_DoWhile {
       public static void main(String[] args) {
     Scanner input = new Scanner (System.in) ;
     
         int angka,fac,i ;
         System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE====");
         System.out.println("Masukkan bilangan ; ");
         
         angka = input.nextInt () ;
         fac = 1;
         i = 1;
         do
         {
         fac = fac*i ;
         i ++ ;
         }
         while (i<=angka);
           System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fac);
           
          
}
}