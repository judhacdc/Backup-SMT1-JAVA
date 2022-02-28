/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
          Random random=new Random();
          
   char menu = 'y';
   do { 
       int number = random.nextInt(10)+1;
       boolean success = false ;
       do { 
           System.out.print("Tebak Angka (1-10): ");
           int answer = input.nextInt();
           input.nextLine();
           success = answer==number;
           
           if (answer>number){
               System.out.println("Angka yang anda masukkan lebih besar dari jawaban");}
           else if (answer==number){
               System.out.println();}
           else {
               System.out.println("Angka yang anda masukkan lebih kecil dari jawaban");}
           
       } while (!success);
       System.out.print("Apakah Anda ingin mengulang permainan? (Y/n)");
       menu = input.findInLine(".").charAt(0);
       input.nextLine();
   } while (menu=='y' || menu=='Y');
          
}
}