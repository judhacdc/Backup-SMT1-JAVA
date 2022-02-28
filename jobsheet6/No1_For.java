/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;
public class No1_For {

   
    public static void main(String[] args) {
        int angka,fac,i ;
        System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DEMGAN FOR====");
        System.out.println("Masukkan bilangan\t:");
        
        Scanner input = new Scanner (System.in) ;
        angka = input.nextInt() ;
        fac = 1;
        for (i=1; i <=angka;i++){
        fac = fac*i ;
        }
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n",fac);
    }
    
}
