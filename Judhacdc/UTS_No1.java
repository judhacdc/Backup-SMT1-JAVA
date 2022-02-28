/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
public class UTS_No1 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
     int tahun;
           System.out.print("Masukkan Tahun\t\t:");
           tahun=sc.nextInt();
           
       if (tahun%4==0) {
           
       if (tahun%400==0){
           System.out.println("Tahun Kabisat");  
           System.out.println("Karena Merupakan Abad Baru dan Kelipatan dari 400");}
       else if (tahun%4!=1){
           System.out.println("Tahun Kabisat");
           System.out.println("Karena Bukan Merupakan Abad Baru dan Habis di bagi 4");}
       else {
           System.out.println("Bukan Tahun Kabisat");
           System.out.println("Karena Merupakan Abad Baru tetapi Tidak Habis di Bagi 400");}
       }
       
       else {
           System.out.println("Bukan Tahun Kabisat");
           System.out.println("Karena Merupakan Tahun Ganjil");}
}
}

// DI BUAT OLEH JUDHA MAYGUSTYA