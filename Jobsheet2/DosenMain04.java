package Jobsheet2;

public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";
        dosen1.tampilkanInformasi();
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahBidangKeahlian("Pemrograman Basis Data");
        dosen1.tampilkanInformasi();

        Dosen04 dosen2 = new Dosen04();
        dosen2.idDosen = "D002";
        dosen2.nama = "Dr. Siti Aminah";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2015;
        dosen2.bidangKeahlian = "Sistem Informasi";
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2024);
        dosen2.tampilkanInformasi();
        
    }
}
