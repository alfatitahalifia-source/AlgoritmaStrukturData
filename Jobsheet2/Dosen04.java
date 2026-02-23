package Jobsheet2;

public class Dosen04 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("=================Data Dosen=============");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
    void ubahBidangKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
    }
}
