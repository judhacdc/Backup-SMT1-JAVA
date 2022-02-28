/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class No1_Praktikum {
    public static void main(String[] args) {  
        
    Scanner input = new Scanner(System.in);
    int urutan ;
    String [] bulan = new String [12];
       bulan[0]="Januari";     bulan[4]="Mei";        bulan[8]="September";
       bulan[1]="Februari";    bulan[5]="Juni";       bulan[9]="Oktober";
       bulan[2]="Maret";       bulan[6]="Juli";       bulan[10]="November";
       bulan[3]="April";       bulan[7]="Agustus";    bulan[11]="Desember";
       
        System.out.println("Masukkan Urutan Bulan (1-2) : ");
        urutan = input.nextInt();
        
        if (urutan==1){
            System.out.println(bulan[0]);}
        else if (urutan==2){
            System.out.println(bulan[1]);}
         else if (urutan==3){
            System.out.println(bulan[2]);}
         else if (urutan==4){
            System.out.println(bulan[3]);}
         else if (urutan==5){
            System.out.println(bulan[4]);}
         else if (urutan==6){
            System.out.println(bulan[5]);}
        else if (urutan==7){
            System.out.println(bulan[6]);}
        else if (urutan==8){
            System.out.println(bulan[7]);}
        else if (urutan==9){
            System.out.println(bulan[8]);}
        else if (urutan==10){
            System.out.println(bulan[9]);}
        else if (urutan==11){
            System.out.println(bulan[10]);}
        else if (urutan==12){
            System.out.println(bulan[11]);}
}
}
//Code By Judha Maygustya