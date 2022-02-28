/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6_perulangan;

import java.util.Scanner;
public class TugasNo1_DoWhile {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
         System.out.println("Masukkan Bilangan : ");
         int angka = sc.nextInt () ;
         
      int a = 0;
      do {
          
              a++ ;
          if (a%5 == 0) {
              continue;
           
           }

          System.out.println(a);
       }
           while (a < angka); 
}
}