/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
public class UTS_Shilma {

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int garis1,garis2,garis3 ;
        
        System.out.print("Masukkan Panjang Garis 1\t\t: ");
        garis1 = sc.nextInt();
        System.out.print("Masukkan Panjang Garis 2\t\t: ");
        garis2 = sc.nextInt();
        System.out.print("Masukkan Panjang Garis 3\t\t: ");
        garis3 = sc.nextInt();
        
        int wuf1=garis2+garis3;   int input ;
        int wuf2=garis1+garis3;   
        int wuf3=garis1+garis2;  
        
        if (garis1<wuf1){
            System.out.println("SEGITIGA");}
        else if (garis2<wuf2){
            System.out.println("SEGITIGA");}
        else if (garis3<wuf3){
            System.out.println("SEGITIGA");}
        else {
            System.out.println("BUKAN SEGITIGA");}
        
       boolean stop=false; 
       for (;!stop;) {
        System.out.println("Masukkan angka (1) untuk menghitung luas"
                + "\nMasukkan angka (2) untuk menghitung keliling"
                + "\nMasukkan angka (3) untuk mengakhiri Program");
        input = sc.nextInt();
        int keliling = garis1+garis2+garis3;
        float luas = 0.5F*garis1*garis2 ; 
                
                
        if (input==2){
            System.out.println("Keliling Segitiga yakni sebesar : "+keliling);}
        else if (input==1){
            System.out.println("Luas Segitiga yakni sebesar : "+luas);
        if (luas>50){
            System.out.println("Segitiga Sangat Luas");}
        else {
            System.out.println("Segitiga Tidak Luas");}}
     if (input==3)
        stop=true;} System.out.println("SELESAI");
    }
    
}
