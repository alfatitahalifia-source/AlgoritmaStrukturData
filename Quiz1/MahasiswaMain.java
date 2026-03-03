package Quiz1;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();    
        System.out.print("Masukkan NIM: ");
        mhs.nim = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        mhs.nama = scanner.nextLine();
        System.out.print("Masukkan tahun masuk: ");
        mhs.tahunMasuk = scanner.nextInt();
        mhs.mataKuliahDiambil = new MataKuliah[3];
        System.out.println("\nInformasi Mahasiswa:");
        mhs.tampilkanInfo();
        System.out.println("\nMasukkan Mata Kuliah yang Diambil:");
        for (int i = 0; i < mhs.mataKuliahDiambil.length; i++) {
            System.out.println("Mata Kuliah " + (i + 1) + ":");
            MataKuliah mk = new MataKuliah();
            System.out.print("Masukkan kode MK: ");
            scanner.nextLine(); 
            mk.kodeMK = scanner.nextLine();
            System.out.print("Masukkan nama MK: ");
            mk.namaMK = scanner.nextLine();
            System.out.print("Masukkan SKS: ");
            mk.sks = scanner.nextInt();
            mhs.tambahMataKuliah(mk);
        }
        mhs.hitungTotalSKS();
    }
}
