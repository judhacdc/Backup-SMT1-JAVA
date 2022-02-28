import java.util.Scanner;
public class KuisNo2 {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int tanggalsekarang,bulansekarang,tahunsekarang ;
       
         System.out.println("======== PROGRAM TANGGAL LAHIR ==========");
         System.out.print("Masukkan tanggal sekarang\t\t\t:");
         tanggalsekarang = sc.nextInt();
         System.out.print("Masukkan bulan sekarang\t\t\t\t:");
         bulansekarang = sc.nextInt() ;
         System.out.print("Masukkan tahun sekarang\t\t\t\t:");
         tahunsekarang = sc.nextInt () ;
                System.out.print("Tanggal sekarang "+tanggalsekarang); System.out.print(" - "+bulansekarang); System.out.println(" - "+tahunsekarang);
          int tanggallahir,bulanlahir,tahunlahir ;
          System.out.print("Masukkan tanggal lahir\t\t\t: ");
          tanggallahir = sc.nextInt ();
          System.out.print("Masukkan bulan lahir\t\t\t: ");
          bulanlahir = sc.nextInt () ;
          System.out.print("Masukkan tahun lahir\t\t\t: ");
          tahunlahir = sc.nextInt() ;
          //output 1
          System.out.print("Anda lahir pada tanggal\t\t\t: "+tanggallahir); System.out.print(" - "+bulanlahir); System.out.print(" - "+tahunlahir);
          System.out.println(" ");
          //proses 1
          int usiatanggal,usiabulan,usiatahun ;
          usiatanggal = tanggalsekarang - tanggallahir ;
          usiabulan = bulansekarang - bulanlahir ;
          usiatahun = tahunsekarang - tahunlahir ;
          //output2
          System.out.print("Jadi Usia anda sekarang adalah\t\t"+usiatahun); System.out.print(" Tahun " +usiabulan); System.out.print(" Bulan "+usiatanggal); System.out.print(" Hari ");
          
    }
}