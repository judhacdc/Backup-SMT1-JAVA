/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1daspromateri;

import java.util.Scanner;
public class KuisDasproMateriSuhu {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int detik,jam,menit,detik2 ;
      
        System.out.print("Masukkan detik\t\t:"); 
        detik = sc.nextInt();
        //proses
        jam = detik/3600 ;
        menit = (detik%3600)/60 ;
        detik2 = (detik%3600)-(menit*60) ;
        //output
        System.out.print("Totaljam\t\t:"+jam);System.out.println("");
        System.out.print("Total menit\t\t:"+menit);System.out.println("");
        System.out.print("Total detik\t\t:"+detik);System.out.println("");
        
      
    }
}
