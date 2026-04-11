package CaseMethod1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih; 

        Mahasiswa[] mhs = new Mahasiswa[] {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };
        Buku[] buku = new Buku[] {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024) 
        };
        Peminjaman[] pinjam ={
            new Peminjaman(mhs[0], buku[0], 7),
            new Peminjaman(mhs[1], buku[1], 3),
            new Peminjaman(mhs[2], buku[2], 10),
            new Peminjaman(mhs[2], buku[3], 6),
            new Peminjaman(mhs[0], buku[1], 4)
        };
        do {
            System.out.println("\n====== Menu =====");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa m : mhs) {
                        m.tampilInformasi();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nData Buku:");
                    for (Buku b : buku) {
                        b.tampilBuku();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman p : pinjam) {
                        p.hitungDenda();
                        System.out.println(p.mhs.nama + " - " + p.buku.judul + " selama " + p.lamaPinjam + " hari, terlambat " + p.terlambat + " hari, denda Rp " + p.denda);
                    }
                    break;
                case 4:
                    System.out.println("\nPeminjaman Urut Berdasarkan Denda:");
                    // Sorting peminjaman berdasarkan denda menggunakan bubble sort
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }
                    for (Peminjaman p : pinjam) {
                        System.out.println(p.mhs.nama + " - " + p.buku.judul + " selama " + p.lamaPinjam + " hari, terlambat " + p.terlambat + " hari, denda Rp " + p.denda);
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM yang ingin dicari: ");
                    // Mencari menggunakan Sequential Search
                    String cariNim = sc.nextLine();
                    boolean found = false;
                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(cariNim)) {
                            p.hitungDenda();
                            System.out.println(p.mhs.nama + " - " + p.buku.judul + " selama " + p.lamaPinjam + " hari, terlambat " + p.terlambat + " hari, denda Rp " + p.denda);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("NIM tidak ditemukan!");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    
            }
        } while (pilih != 0);
            sc.close();
    }
}
