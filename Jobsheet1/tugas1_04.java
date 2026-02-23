package Jobsheet1;

import java.util.Scanner;

public class tugas1_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Sidoarjo"}
        };

        System.out.println("==============================");
        System.out.println("Program Pencarian Kota Plat");
        System.out.println("==============================");
        System.out.print("Masukkan kode plat kendaraan : ");
        char input = sc.next().toUpperCase().charAt(0);
        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                System.out.println("Kota asal kendaraan : " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}
