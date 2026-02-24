package Jobsheet3;

import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.print("Masukkan data dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 
        Dosen04[] arrayOfDosen04s = new Dosen04[jumlahDosen];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("------------------------------");
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Masukkan Kode: ");
            kode = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin (1=laki-laki, 0=perempuan): ");
            jenisKelamin = sc.nextLine().equals("1");
            System.out.print("Masukkan Usia: ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------");  
            arrayOfDosen04s[i] = new Dosen04(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("------------------------------");
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfDosen04s[i].kode);
            System.out.println("Nama: " + arrayOfDosen04s[i].nama);
            System.out.println("Jenis Kelamin: " +
            (arrayOfDosen04s[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + arrayOfDosen04s[i].usia);
            System.out.println("-----------------------------");
        }
        DataDosen04 dataDosen04 = new DataDosen04();
        dataDosen04.dataSemuaDosen(arrayOfDosen04s);
        System.out.println("--------------------------------");
        dataDosen04.jumlahDosenPerJenisKelamin(arrayOfDosen04s);
        dataDosen04.rataRataUsiaDosen(arrayOfDosen04s);
        System.out.println("--------------------------------");
        dataDosen04.infoDosenTertua(arrayOfDosen04s);
        dataDosen04.infoDosenTermuda(arrayOfDosen04s);
        System.out.println("--------------------------------");

    }
}
