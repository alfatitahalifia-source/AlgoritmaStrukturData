package Jobsheet2;

import java.util.Scanner;

public class Mahasiswa04 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa04(){
        }
        public Mahasiswa04 (String nm, String nim, double ipk, String kls){
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }

    void tampilkanInformasi() {
        System.out.println("=================Data Mahasiswa=============");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04 mhs = new Mahasiswa04();
        System.out.print("Nama : ");
        mhs.nama = sc.nextLine();
        System.out.print("NIM : ");
        mhs.nim = sc.nextLine();
        System.out.print("Kelas :");
        mhs.kelas = sc.nextLine();
        System.out.print("IPK : ");
        mhs.ipk = sc.nextDouble();

        System.out.print("Masukkan IPK: ");
        double inputIpk = sc.nextDouble();
        mhs.updateIpk(inputIpk);
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());

    }
}
