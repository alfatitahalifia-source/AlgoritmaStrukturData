package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        int jumMhs = 5;
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(n);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        System.out.println("--------------------");
        System.out.println(" PENCARIAN DATA ");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential search");
        double posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("Pencarian data");
        System.out.println("----------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari2 = sc.nextDouble();

        System.out.println("menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);

        System.out.println("\n=== DATA SEBELUM SORTING ===");
        list.tampil();

        System.out.println("\n=== BUBBLE SORT (DESCENDING) ===");
        list.bubbleSort();
        list.tampil();

        System.out.println("\n=== SELECTION SORT (ASCENDING) ===");
        list.selectionSort();
        list.tampil();

        System.out.println("\n=== INSERTION SORT (ASCENDING) ==="); 
        list.insertionSort();
        list.tampil();
    }
}