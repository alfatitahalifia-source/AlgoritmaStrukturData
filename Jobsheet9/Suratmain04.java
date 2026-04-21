package Jobsheet9;

import java.util.Scanner;

public class Suratmain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat04 stack = new StackSurat04(5);
        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Teratas");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S = Sakit, A = Alpa, I = Izin): ");
                    char jenisizin = sc.nextLine().charAt(0);
                    System.out.print("Durasi Izin (dalam hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat04 suratBaru = new Surat04(idSurat, namaMahasiswa, kelas, jenisizin, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat izin berhasil ditambahkan.");
                    break;
                case 2:
                    Surat04 suratDihapus = stack.pop();
                    if (suratDihapus != null) {
                        System.out.println("Surat izin dari " + suratDihapus.namaMahasiswa + " telah diproses");
                    } else {
                        System.out.println("Stack kosong! Tidak ada surat yang bisa diproses.");
                    }
                    break;
                case 3:
                    Surat04 suratTeratas = stack.peek();
                    if (suratTeratas != null) {
                        System.out.println("Surat Izin Teratas:");
                        System.out.println("ID Surat: " + suratTeratas.idSurat);
                        System.out.println("Nama Mahasiswa: " + suratTeratas.namaMahasiswa);
                        System.out.println("Kelas: " + suratTeratas.kelas);
                        System.out.println("Jenis Izin: " + suratTeratas.jenisizin);
                        System.out.println("Durasi Izin: " + suratTeratas.durasi + " hari");
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang ingin dicari: ");
                    String namasurat = sc.nextLine();
                    stack.cariSurat(namasurat);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (true);
    }
}
