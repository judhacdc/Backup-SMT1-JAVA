/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_pertemuan5;

import java.util.Scanner;
public class Pemilihan1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
int bil1,bil2,bil3 ;
System.out.println("+---------------------------------------------------+");
System.out.println("|         MEMBANDINGKAN 2 BILANGAN BY: JUDHA        |");
System.out.println("+---------------------------------------------------+");
System.out.print("Masuakkan Bilangan ke 1\t:");
bil1 = input.nextInt () ;
System.out.print("Masuakkan Bilangan ke 2\t:");
bil2 = input.nextInt ();
System.out.println("Masukkan Bilangan ke 3\t:");
bil3  = input.nextInt ();
	
    if (bil1 > bil2) {
        System.out.println("Nilai yang lebih Besar yakni \t: "+bil1);}
    else if (bil1 > bil3) {
        System.out.print("Nilai yang lebih Besar yakni \t: "+bil1);}
    else if(bil2>bil1) {
        System.out.println("Nilai yang lebih Besar yakni \t: "+bil2);}
    else if(bil2>bil3) {
        System.out.println("Nilai yang lebih Besar yakni \t: "+bil2);}
    else if(bil3>bil1) {
        System.out.println("Nilai yang lebih Besar yakni \t: "+bil3);}
    else if(bil3>bil2) {
        System.out.println("Nilai yang lebih Besar yakni \t: "+bil2);}
	}
}