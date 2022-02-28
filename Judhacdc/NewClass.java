/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Judhacdc;

import java.util.Scanner;
public class NewClass {
    
    
  
public static void main(String[] args) {
 
int n, m, r;
 
Scanner dataInput = new Scanner(System.in);
 
System.out.print("Masukkan nila n : ");
n = dataInput.nextInt();
System.out.print("Masukkan nila m : ");
m = dataInput.nextInt();
System.out.println();
 
r = m % n;
 
while (r != 0) {
n = m;
m = r;
r = n % m;
}
System.out.println("FPB = "+m);
}
}
