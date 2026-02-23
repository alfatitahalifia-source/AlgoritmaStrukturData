package Jobsheet1;

import java.util.Scanner;

public class tugas2_04 {    
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int n;
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("Program Jadwal Kuliah Mahasiswa");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        n = sc.nextInt();
        sc.nextLine();

        jadwal = new String[n][4];

        inputJadwal();
        tampilkanSemuaJadwal();

        System.out.print("\nMasukkan hari yang ingin ditampilkan : ");
        String hari = sc.nextLine();
        tampilkanByHari(hari);

        System.out.print("\nMasukkan nama mata kuliah : ");
        String mk = sc.nextLine();
        tampilkanByMataKuliah(mk);
    }

    // Fungsi input jadwal
    static void inputJadwal() {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    // Fungsi menampilkan semua jadwal
    static void tampilkanSemuaJadwal() {
        System.out.println("\n==================== DAFTAR JADWAL ====================");
        System.out.println("Mata Kuliah\t\tRuang\t\tHari\t\tJam");
        for (int i = 0; i < n; i++) {
            System.out.println(
                jadwal[i][0] + "\t\t\t" +
                jadwal[i][1] + "\t\t" +
                jadwal[i][2] + "\t\t" +
                jadwal[i][3]
            );
        }
    }

    // Fungsi menampilkan jadwal berdasarkan hari
    static void tampilkanByHari(String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari);
        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal pada hari tersebut");
        }
    }

    // Fungsi menampilkan jadwal berdasarkan mata kuliah
    static void tampilkanByMataKuliah(String mk) {
        System.out.println("\nJadwal Mata Kuliah " + mk);
        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    "Hari : " + jadwal[i][2] +
                    ", Jam : " + jadwal[i][3] +
                    ", Ruang : " + jadwal[i][1]
                );
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }
}