
package jobsheet8;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;
public class No2_Praktikum {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {  
        
    Scanner input = new Scanner(System.in);
    int [] judha = new int [5];
    
    
    for (int i=0;i<judha.length;i++){
        System.out.print("Masukkan Bilangan Array ke-"+i+" :");
    judha[i]=input.nextInt(); }
    
         System.out.println("SEBELUM DI BALIK");
    for (int i=0;i<judha.length;i++){
        System.out.print(judha[i]+" ");} // Sebelum di Balik
         System.out.println("");
         
    //------------------------------------------------------//
         System.out.println("SESUDAH DI BALIK");
 for (int i =4;i>=0;i--){
     System.out.print(judha[i]+" ");}
  
    
}
}
