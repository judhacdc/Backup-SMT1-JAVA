/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5_pemilihan2;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;
public class Jobsheet5_Pemilihan2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai ;
        
        System.out.print("Masukkan nilai ujian (0-100): ");
        nilai = sc.nextInt () ;
        
        
        
        if (nilai >=0 && nilai <= 100){
            if (nilai >= 90 && nilai <= 100) {
                System.out.print("Nilai A, EXCELENT!");
            } else if (nilai >= 80 && nilai <=89){
                System.out.print("Nilai B,Pertahankan prestasi Anda!");
            } else if (nilai >= 60 && nilai <=79){
                System.out.print("Nilai C,tingkatkan prestasi Anda!");
            } else if (nilai >= 50 && nilai <= 59) {
                System.out.print("Nilai D,tingkatkan belajar Anda!");
                
            } else {System.out.println("Nilai E,Anda tidak lulus!"); }
            } else {System.out.print("Nilai yang anda masukkan tidak valid");}
      
        

        
        }
    }
    
