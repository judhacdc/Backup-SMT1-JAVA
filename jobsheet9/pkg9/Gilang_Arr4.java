/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

import java.util.Scanner;
public class Gilang_Arr4 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Masukkan jumlah baris : ");
        int m = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int n = sc.nextInt();
        System.out.println("===============================");
        int [][] nilai = new int [m] [n];
        
        //input nilai atau data pada array dari keyboard dengan nested loop
        for (int i=0; i<nilai.length ; i++){
            for (int j=0; j<nilai[0].length ; j++){
                System.out.print("Masukkan angka array pada baris ke- " + i + ", kolom ke- " + j + " : ");
                nilai [i][j]= sc.nextInt();
            }
            System.out.println("===============================");
        }
        //mencetak isi array dengan nested loop
        System.out.println("Isi array nilai adalah : ");
        for (int i=0; i<n ; i++){
            for (int j=0; j<m ; j++){
                System.out.print(nilai [i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("===============================");
        
        //mencari nilai genap dan indeks
        int i=0;
        do {
        int j=0;
        do{
            System.out.println("");}
        while (j<n);
             System.out.println("angka genap : " + nilai [i][j] + " Pada indeks [ " + i + " ] [ " + j + " ]");
        i++; }
        while (i<m);
        
        
        
        
        
      
    }
}
