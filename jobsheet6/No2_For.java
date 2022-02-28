/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.util.Scanner;
public class No2_For {
    
       public static void main(String[] args) {
     Scanner input = new Scanner (System.in) ;
     
         int angka,b ;
         System.out.println("====PROGRAM LOOP DENGAN BREAK====");
         
         for(b=0; true;) {
         System.out.print("Masukkan bilangan : ");
         angka = input.nextInt ();
         b += angka ;
         if (b>50) break ;
       
       }
           System.out.printf("Angka berhentipada jumlah angka : %d \n",b);
       }
}