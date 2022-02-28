/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1daspromateri;

import java.util.Scanner;
public class Kuis1DasproMateri {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float volume,phi,jarijari,volumebola,volumebola2 ;
        phi = 3.14F ;
         System.out.print("Masukkan jari-jari\t\t\t:");
         jarijari = sc.nextFloat ();
         //menghitung volume
         volumebola = phi*jarijari*jarijari*jarijari ;
         volumebola2= volumebola*4/3 ;
         System.out.print("Jadi volume bola yakni\t\t\t:"+volumebola2);
         System.out.println(" ");
         
    }
    
}
