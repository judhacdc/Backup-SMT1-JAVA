/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

import java.util.Scanner;

public class Percobaan2 {

    
    
   

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int bilangan,pangkat;
        System.out.print("Bilangan yang di hitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        
        System.out.println(hitungPangkat(bilangan,pangkat));
    }

}
