/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
public class rataNilai {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
  

  int total = 0; int x =0;
  int total1=0;  int y=0;
  int siswa;
  
        System.out.print("Masukkan jumlah siswa   : ");
        siswa = sc.nextInt();
        
  int nilaiMHS [] =new int [siswa] ;
  // supaya loop sesuai jumlah sisawa //
  
  for (int i=0;i<nilaiMHS.length;i++){
      System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
  nilaiMHS[i]=sc.nextInt();
  
  if (nilaiMHS[i]>70){
  total+=nilaiMHS[i];
  x=(i+1); }
  
  else if (nilaiMHS[i]<=70){
  total1+=nilaiMHS[i];}
  y=(i+1-x);}
  
  float ratalulus=total/x;
        System.out.println("Nilai Rata Rata Lulus : "+ratalulus);
  float ratatidaklulus=total1/y;
        System.out.println("Nilai Rata Rata Tidak Lulus : "+ratatidaklulus);

  

}
}