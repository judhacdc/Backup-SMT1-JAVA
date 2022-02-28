/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;
public class Lingkaran {
    
    private static float luas (int jarijari) {
        float luas =0;
    luas = 3.14F*(jarijari*jarijari);
    return luas ;
    }
    
    private static float keliling (int jarijari){
    float keliling = 0;
    keliling = 3.14F*2*jarijari;
    return keliling ;}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan Jari-jari: ");
        int jari2 = sc.nextInt();
        System.out.println("Pilih Menu : "
                + "\n 1.Keliling"
                + "\n 2.Luas");
        int masukan = sc.nextInt();
        
        float luas = luas (jari2);
        float keliling = keliling(jari2);
        
        if (masukan==1){
            System.out.println("Keliling lingkaran Sebesar : "+keliling);}
        else if (masukan==2){
            System.out.println("Luas Lingkaran sebesar : "+luas);}
        else {
            System.out.println("Mohon masukkan bilangan 1 atau 2 , selain itu perintah di tolak "
                    + "\n Terimakasih ");}
    }
    
    
}
