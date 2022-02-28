/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6_perulangan;

import java.util.Scanner;
public class TugasNo3_DoWhile {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int angka1,angka2,range,i,total ;
    double ratarata ;
    angka1 = 0 ;
    angka2 = 1 ;
    total = 0 ;
    i =0 ;
    
    System.out.print ("Masukkan jumlah deret Fibonacci yang di inginkan : ") ;
    range = sc.nextInt();
   
    do {
    total = angka1+angka2 ;
    angka1 = angka2 ;
    angka2 = total ;
    i = angka1 + angka2 ;
        System.out.print(""+angka1); System.out.print(" + "+angka2); System.out.println(" = "+i);
    }
    
    while (i<range) ;
    
}
}