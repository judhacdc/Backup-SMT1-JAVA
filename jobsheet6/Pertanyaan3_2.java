/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;


public class Pertanyaan3_2 {
      public static void main(String[] args) {
          
          int n =5 ;
          boolean stop = false ;
          int i =1;
          while (!stop){
          if (i>=n){
          stop = true;
          } else {
          if (i%2 == 1){
              System.out.print(" # ");
          } else {
              System.out.print(" * ");
          
          }
          i ++ ;
          }
              }
}
}