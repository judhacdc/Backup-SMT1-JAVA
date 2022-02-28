/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ganjilgenap;

import java.util.Scanner;
public class Ganjilgenap {

    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
          
         
         System.out.println("|-----------------------------------------|");
         System.out.println("|  MENENTUKAN BILANGAN GANJIL DAN GENAP   |");
         System.out.println("|-----------------------------------------|");
          System.out.print("| Masukkan bilangan\t:");
          long angka = input.nextInt() ;
          
          if(angka % 2 == 0) {
          System.out.println("| Angka\t\t\t:"+angka + "  Bilangan Genap" ); 
          }
          else { 
                  System.out.println("| Angka\t:"+angka + "  Bilangan Ganjil");
          }
          System.out.print("+-----------------------------------------+");
    }
    
}

