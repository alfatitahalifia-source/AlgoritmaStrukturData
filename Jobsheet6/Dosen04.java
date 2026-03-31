package Jobsheet6;

public class Dosen04 {
    String kode,nama;
    Boolean jenisKelamin;
    int usia;

    Dosen04(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    void tampilInformasi() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        if (jenisKelamin == true) {
        System.out.println("Jenis Kelamin: Laki-laki");
        } else {
            System.out.println("Jenis Kelamin: Perempuan");
        }
        System.out.println("Usia : " + usia);
    }

}
