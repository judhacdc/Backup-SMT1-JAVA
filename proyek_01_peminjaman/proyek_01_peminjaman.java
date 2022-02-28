/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek_01_peminjaman;

import java.util.Scanner;

public class proyek_01_peminjaman {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String[] camName = {"cam1", "cam2", "cam3", "cam4", "cam5", "cam6", "cam7", "cam8", "cam9", "cam10"};
        int[][] stckPrice = {
            {1, 22},
            {3, 24},
            {5, 26},
            {7, 28},
            {9, 10},
            {11, 12},
            {13, 14},
            {15, 16},
            {17, 18},
            {19, 20}
        };
        char menu;

        //call function to show data
        showData(camName, stckPrice);

        //Edit data
        System.out.print("Apakah anda ingin merubah data[y/n] : ");
        menu = userInput.next().charAt(0);
        if (menu == 'y' || menu == 'Y') {
            //call func to edit data
            editData(camName, stckPrice);
        } else if (menu == 'n' || menu == 'N') {
            showData(camName, stckPrice);
        } else {
            System.out.println("u`re suck");
        }

        userInput.nextLine();

        System.out.println("========================================================");
        System.out.println("\t\t Input Formulir Alfan.cam");
        System.out.println("========================================================");
        System.out.print("Nama Peminjam\t\t\t : ");
        String Nama = userInput.nextLine();
        System.out.print("Pilih kamera \t (1-10): ");
        String NamaCam = userInput.nextLine();
        System.out.print("Jumlah Cam yang di pinjam \t : ");
        int jumlah = userInput.nextInt();
        System.out.print("Jumlah uang yang di berikan\t : ");
        int jumlahuang = userInput.nextInt();
        System.out.println("Masukkan jam anda meminjam\t : ");
        int jam = userInput.nextInt ();
        System.out.println("Masukkan lama meminjam\t :");
        int lama = userInput.nextInt();

      
    }

    
    
    
    
    
    
    //  FUNGSI 
    private static void showData(String[] name, int[][] stkNprice) {
        System.out.println("==========================================================================================");
        System.out.println("| No |\t Nama Cam \t|\t stok \t|\tBiaya sewa\t\t               |");
        System.out.println("==========================================================================================");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("| %d |\t %s \t\t|\t %2d \t|\t\t %d\t\t\t|\n", (i + 1), name[i], stkNprice[i][0], stkNprice[i][1]);
        }
    }

    private static void editData(String[] nama, int[][] stkNprice) {
        Scanner userInput = new Scanner(System.in);
        int chooseNum, swapStock, swapFee;
        String swapName;
        char yum;

        System.out.print("Masukan no barang yang akan diedit : ");
        chooseNum = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Masukan Nama Cam : ");
        swapName = userInput.nextLine();
        System.out.print("Masukan stok : ");
        swapStock = userInput.nextInt();
        System.out.print("Masukan biaya sewa  : ");
        swapFee = userInput.nextInt();

        System.out.print("Apakah anda yakin ingin memproses[y/n] : ");
        yum = userInput.next().charAt(0);
        if (yum == 'y' || yum == 'Y') {
            nama[chooseNum - 1] = swapName;
            stkNprice[chooseNum - 1][0] = swapStock;
            stkNprice[chooseNum - 1][1] = swapFee;
        } else {
            System.out.println("f u men");
        }
        showData(nama, stkNprice);
    }

}
