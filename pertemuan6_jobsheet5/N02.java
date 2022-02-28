/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_jobsheet5;

import java.util.Scanner;
public class N02 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float sisi1,sisi2,sisi3 ;
       
       System.out.print("+================================== +");
        System.out.println("");
        System.out.print("|PROGRAM PEMILIHAN SEBUAH SEGITIGA  |");
        System.out.println("");
        System.out.println("+===================================+");
       
         System.out.print("Masukkan sisi 1\t\t\t: ");
         sisi1 = sc.nextFloat();
         System.out.print("Masukkan sisi 2\t\t\t: ");
         sisi2 = sc.nextFloat() ;
         System.out.print("Masukkan sisi 3\t\t\t: ");
         sisi3 = sc.nextFloat() ;
         
        
        float dor2 = sisi1+sisi2+sisi3 ;
        
       if (sisi1==sisi2	&& sisi2 == sisi3 && sisi1== sisi3){
           System.out.print("Segitiga Sama sisi");
       }
       else if (sisi1==sisi2 || sisi1==sisi3 || sisi2==sisi1 || sisi2==sisi3 || sisi3==sisi1 || sisi3==sisi2)
       {System.out.print("Segitiga Sama Kaki");
       }
       else if (sisi1!=sisi2	&& sisi2 != sisi3 && sisi1!= sisi3 ){
           System.out.print("Segitiga Sembarang");}
        
}
}