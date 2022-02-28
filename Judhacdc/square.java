/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
public class square {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        
         for(int iOuter=0; iOuter<=N;iOuter++){
        for (int i=1;i<=N;i++){
            System.out.print("*");}
             System.out.println();
        }
}
}