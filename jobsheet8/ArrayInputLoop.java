/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class ArrayInputLoop {
       public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
  
  int [] nilaiUAS = new int [6];
  
  for (int i=0;i<nilaiUAS.length;i++){
      System.out.println("Masukkan Nilai UAS ke-"+i+" :");
  nilaiUAS[i]=sc.nextInt();}
  
  for (int i=0;i<nilaiUAS.length;i++){
  if (nilaiUAS[i]>70){
      System.out.println("Mahasiswa ke-"+i+"LULUS!");}
  else {
          System.out.println("Mahasiswa ke-"+i+"TIDAK LULUS");}}
  
}
}