/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
import java.util.Scanner;
public class Jobsheet10_No1 {

    static int Max3(int bil1, int bil2, int bil3) {
        int terbesar = 0;

        if (bil1 > bil2) {
            terbesar = bil1;
        } else if (bil1 > bil3) {
            terbesar = bil1;
        } else if (bil2 > bil1) {
            terbesar = bil2;
        } else if (bil2 > bil3) {
            terbesar = bil2;
        } else if (bil3 > bil1) {
            terbesar = bil3;
        } else if (bil3 > bil2) {
            terbesar = bil3;
        }
        return terbesar;

    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
        System.out.print(" Masukkan bil 1 : ");
        int b1 = sc.nextInt();
        System.out.print("Masukkan bil 2 : ");
        int b2 = sc.nextInt();
        System.out.print("Masuakkan bil 3 : ");
        int b3 = sc.nextInt();
        
        int hasil = Max3(b1,b2,b3) ;
        
        System.out.println("Bilangan Terbesar adalah : "+hasil);
    }

}
// Code By Judha Maygustya