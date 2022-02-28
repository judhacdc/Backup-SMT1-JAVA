/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_jobsheet5;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;
public class ngentot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int golongan, golongan1=2500000, golongan2=3000000, golongan3=4500000;
         int gaji, lamaKerja, total, tunjangan;
         
         System.out.println("Masukkan golongan anda ");
         System.out.println("1.Golongan 1");
         System.out.println("2.Golongan 2");
         System.out.println("3.Golongan 3");
         System.out.print("Masukkan pilihan anda (1,2,3) : ");
         golongan=sc.nextInt();
         
         if(golongan==1){
             System.out.println("Anda termasuk dalam golongan 1, gaji yang anda terima adalah "+golongan1);
             golongan1=golongan;
         }
         else if(golongan==2){
             System.out.println("Anda termasuk dalam golongan 2, gaji yang anda terima adalah "+golongan2);
         }
         else if(golongan==3){
             System.out.println("Anda termasuk dalam golongan 3, gaji yang anda terima adalah "+golongan3);
         }
         System.out.println("berapa lama anda bekerja? ");
         lamaKerja=sc.nextInt();
         if(lamaKerja>=3 && lamaKerja<=5){
             tunjangan=golongan*10/100;
             gaji=golongan+tunjangan;
             System.out.println("gaji yang akan anda terima adalah "+gaji);
         }
         else if(lamaKerja>=6 && lamaKerja<=8){
             tunjangan=golongan*20/100;
             gaji=golongan+tunjangan;
             System.out.println("gaji yang akan anda terima adalah "+gaji);
         }
         else if(lamaKerja>8){
             tunjangan=golongan*25/100;
             gaji=golongan+tunjangan;
             System.out.println("gaji yang akan anda terima adalah "+gaji);
         }
         
    }
}
