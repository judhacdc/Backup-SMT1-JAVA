/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_bumungki;

import java.util.Scanner;
public class NO1_Ganjil {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bil1,bil2,bil3 ;
        
        System.out.print("Masukkan Bilangan Pertama\t\t: ");
        bil1 = sc.nextInt() ;
        System.out.print("Masukkan Bilangan Kedua\t\t: ");
        bil2 =sc.nextInt();
        System.out.println("Masukkan Bilangan Ketiga\t\t: ");
        bil3 = sc.nextInt();
        
        
        if (bil1 < bil2){
            System.out.println("Bilangan terkecil Adalah "+bil1);}
        else if (bil1 < bil3) {
            System.out.println("Bilangan terkecil Adalah "+bil1);}
        
        else if (bil2 < bil1){
            System.out.println("Bilangan terkecil Adalah "+bil2);}
        else if (bil2 < bil3) {
            System.out.println("Bilangan terkecil Adalah "+bil2);}
        
        else if (bil3 < bil1) {
            System.out.println("Bilangan terkecil Adalah "+bil3);}
        else if (bil3 < bil2){
            System.out.println("Bilangan terkecil Adalah "+bil3);}
        
        
        
    }
    
}