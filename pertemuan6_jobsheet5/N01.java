/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_jobsheet5;
import java.util.Scanner;
public class N01 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float bilangan1,bilangan2,hasil;
       char operator;
       
        System.out.print("+==========================================+");
        System.out.println("");
        System.out.print("|PROGRAM KALKULATOR SEDERHANA JUDHA|");
        System.out.println("");
        System.out.println("+==========================================+");
        System.out.print("Masukkan bilangan pertama\t: ");
        bilangan1 = sc.nextFloat ();
        System.out.print("Masukkan Operator\t\t: ");
        operator = sc.next().charAt(0);
        System.out.print("Masukkan bilangan kedua\t\t: ");
          bilangan2 = sc.nextFloat ();
          
                
          switch(operator){
			case '+':
			hasil = bilangan1 + bilangan2;
			System.out.println(bilangan1 + " + " + bilangan2 + "\t\t\t: " + hasil); 
			break;

			case '-':
			hasil = bilangan1 - bilangan2;
			System.out.println(bilangan1 + " - " + bilangan2 + "\t\t\t: " + hasil);
			break;

			case '*':
			hasil = bilangan1 * bilangan2;
			System.out.println(bilangan1 + " * " + bilangan2 + "\t\t\t: " + hasil);
			break;

			case '/':
			hasil = bilangan1 / bilangan2;
			System.out.println(bilangan1 + " / " + bilangan2 + "\t\t\t: " + hasil);
			break;

			default:
			System.out.println("Oerator yang Anda masukkan salah");
		}
           System.out.println("--------------------------------------------");
          
          }
    }
    

