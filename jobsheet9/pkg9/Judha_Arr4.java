/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.pkg9;

/**
 *
 * @author Judha Maygustya
 */
public class Judha_Arr4 {
    public static void main(String[] args) {
        
        int RGB [][][]={
                       {
                           {2,2,3},
                           {5,6,7}
                       },
                       {
                           {6,8,5},
                           {5,2,6} 
                       }
                       };
        for (int array2D[][] : RGB){
        for (int array1D[] : array2D){
        for (int x : array1D){
            System.out.print(x+" ");
            }
            System.out.println();
               }
            System.out.println();
                    }
}
}