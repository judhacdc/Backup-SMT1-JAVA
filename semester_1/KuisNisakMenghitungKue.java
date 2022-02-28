/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester_1;

import java.util.Scanner;
public class KuisNisakMenghitungKue {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rotitono,rotiponakan,rotitetangga,totalagis,totalagis2 ;
        rotitono = (float) 1*((float)1/3) ; 
        
        rotiponakan = (float)1*((float)1/4) ;
        rotitetangga = (float)1*((float)1/4) ;
        
        
         System.out.println("===MENGHITUNG SISA ROTI===");
         System.out.println("Di bagikan ke tono\t\t:"+rotitono);
         System.out.println("Di bagikan ke ponakan\t\t:"+rotiponakan);
         System.out.println("Dibagikan ke tetangga\t\t:"+rotitetangga);
         //total
         
         totalagis = ((float)rotitono + rotiponakan + rotitetangga) ;
         totalagis2 = (1-totalagis) ;
         System.out.println("Sisa Roti ibuwati adalah\t:"+totalagis2);
}
}