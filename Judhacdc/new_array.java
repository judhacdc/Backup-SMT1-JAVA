/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
public class new_array {
    public static void main(String[] args){
        
       Scanner input = new Scanner (System.in);
        int A;
        int [] arr;
        System.out.print("Masukkan jumlah array: ");
        A = input.nextInt();
        arr = new int [A];
        for(int i=0; i<A; i++){
            System.out.print("Masukkan Array ke-" + i + ": ");
            arr[i] = input.nextInt();
        }
        for(int i=0; i<A; i++){
            if(arr[i]%2==0){
                System.out.println("angka genap : " + arr[i]); 
            } 
        }
        
          for(int i=0; i<A; i++){
            if(arr[i]%2==1){
                System.out.println("angka ganjil: " + arr[i]);
            }
        }
        
        
        
        
        
        
        
        
        
    }
}