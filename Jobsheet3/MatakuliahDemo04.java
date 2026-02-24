package Jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan data mata kuliah");
        int jumlahMatakuliah = sc.nextInt();
        Matakuliah04[] arrayOfMatakuliah04 = new Matakuliah04[jumlahMatakuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah04[i] = new Matakuliah04();
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayOfMatakuliah04[i].tambahData(sc);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah04[i].cetakInfo();
            System.out.println();
        }
    }
}