/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class JUDHA_Fibonacci {

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.println("+=========================================+");
        System.out.println("|              DERET FIBONACCI            |");
        System.out.println("+=========================================+\n");
        System.out.print("Masukkan panjang deret ==> ");
        int bil = sc.nextInt();
        System.out.println("Hasil deret Fibonaci :");
        for (int i = 0; i <= bil; i++) {
            System.out.println("▶ " + fibonacci(j));
            j++;
        }
    }

}
