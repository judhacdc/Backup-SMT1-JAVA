/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_pertemuan5;

import java.util.Scanner;
public class Percobaan2 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int nilai ;
     
        System.out.println("Masukkan sebuah Nilai\t\t:");
        nilai = sc.nextInt() ;
        
        if (nilai>=100) {
        nilai+=10 ;}
        else {
        nilai -=10 ;
        }
        System.out.println("Hasil nilai akhir adalah"+nilai); 
}
}