/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester_1;

import java.util.Scanner;
public class KuisRiskaNo2 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         int sekalitlpn,biyaya,jumlahselasa,biyaya1 ;
         sekalitlpn = 90 ;
         jumlahselasa = 4 ;
         biyaya1 = 300 ;
         System.out.print("Sekali menelpon andi menghabiskan waktu selama\t\t\t: "+sekalitlpn); System.out.print(" Menit\n");
         System.out.print("Dalam satu bulan hari selasa ada\t\t\t\t: "+jumlahselasa); System.out.print(" Hari \n");
         System.out.print("Biyaya yang diperlukan\t\t\t\t\t\t:Rp."+biyaya1); System.out.print(" PerMenit\n");
         biyaya = sekalitlpn*4*biyaya1 ;
         System.out.println("Biyaya yang di habiskan andi selama 1 bulan yakni sebesar\t:Rp."+biyaya);
         
}
}