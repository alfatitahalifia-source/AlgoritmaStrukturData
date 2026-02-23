package Jobsheet2;

public class Matakuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    void tampilkanInformasi() {
        System.out.println("=================Mata Kuliah=============");
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }
    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jamBaru) {
        jumlahjam += jamBaru;
    }
    void kurangiJam(int jamKurang) {
        if (jumlahjam - jamKurang >= 0) {
            jumlahjam -= jamKurang;
        } else {
            System.out.println("Jumlah jam tidak bisa negatif.");
        }
    }
}
