/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_jobsheet5;

import java.util.Scanner;
public class NO4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
       int umur,pendapatan,biyayahidup,tanggungan,total ;
       String bekerja,sekolah ;
       char fir ;
       
        System.out.print("Masukkan umur\t\t\t:");
        umur = sc.nextInt() ;
        if (umur >= 18) {
            System.out.print("Masukkan Status Bekerja (Y/N)\t\t\t: ");
             fir = sc.next().charAt(0) ;
           
           
            if (fir== 'y' || fir== 'Y') {
                System.out.print("Masukkan pendapatan perbulan\t\t\t:");
                pendapatan = sc.nextInt() ;
                System.out.print("Masukkan tangggungan perbulan\t\t\t:");
                biyayahidup = sc.nextInt() ;
                total = pendapatan / biyayahidup ;
                if (total < 300000)
                    System.out.print("PENDUDUK MISKIN");
            }
            else if (umur <= 18){
                System.out.println("Masukkan setatus sekolah\t\t\t(sekolah/tidak):");}
                   fir = sc.next().charAt(0) ;
                    if ( fir == 'y' || fir == 'Y'){
                        System.out.println("Bukan penduduk miskin");}
                    else if (fir== 'n' || fir== 'N'){
                        System.out.println("PENDUDUK MISKIN");}
                    
                    
        }
        
}
}