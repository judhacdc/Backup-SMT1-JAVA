import java.util.Scanner;
public class Tugas4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int jumlahA, jumlahB, jumlahC, hargaA, hargaB, hargaC, total1 ;
		double hargaA2, hargaB2, hargaC2, total2, total3;
		System.out.println("Masukkan Harga barang A: ");
		hargaA=sc.nextInt();
		System.out.println("Masukkan Jumlah barang A: ");
		jumlahA=sc.nextInt();
		System.out.println("Masukkan Harga barang B: ");
		hargaB=sc.nextInt();
		System.out.println("Masukkan jumlah barang B: ");
		jumlahB=sc.nextInt();
		System.out.println("Masukkan Harga barang C: ");
		hargaC=sc.nextInt();
		System.out.println("Masukkan jumlah barang C: ");
		jumlahC=sc.nextInt();
	System.out.println("--------------------------------------------");
	System.out.println("		Struk Nota		");
	System.out.println("--------------------------------------------");
	hargaA2= hargaA*jumlahA;
	hargaB2= hargaB*jumlahB;
	hargaC2= hargaC*jumlahC;
        
        //output//
	System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal\t");
	System.out.print("Barang A \t\t" + hargaA); System.out.print("\t\t" + jumlahA); System.out.print("\t\t" + hargaA2);System.out.println("");
        
        
	System.out.print("Barang B \t\t" + hargaB); System.out.print("\t\t" + jumlahB); System.out.print("\t\t" + hargaB2); System.out.println(" ");
        
	System.out.print("Barang C \t\t" + hargaC); System.out.print("\t\t" + jumlahC); System.out.println("\t\t" + hargaC2); System.out.println(" ");
            System.out.println("-----------------------------------------------------------------------");
            
	total1 = (int) hargaA2 + (int) hargaB2 + (int) hargaC2;
	System.out.println("\t\tTotal\t\t\t\t\t:" + total1);
        //PROSES
	hargaA2= hargaA*2/100;
	hargaB2= hargaB*5/100;
	hargaC2= hargaC*10/100;
	total2= hargaA2+ hargaB2+ hargaC2;
	System.out.println("\t\tDiskon\t\t\t\t\t:" + total2);
	total3 = (double) total1-(double) total2;
	System.out.println("\t\tTotal Bayar\t\t\t\t:" + total3);
}
}