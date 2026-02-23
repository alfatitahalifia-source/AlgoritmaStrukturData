package Jobsheet2;

public class MataKuliahMain04 {
    public static void main(String[] args) {
        Matakuliah04 mk1 = new Matakuliah04();
        mk1.kodeMK = "SI123";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahjam = 45;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(15);
        mk1.tampilkanInformasi();

        Matakuliah04 mk2 = new Matakuliah04();
        mk2.kodeMK = "TI456";
        mk2.nama = "Basis Data";
        mk2.sks = 3;
        mk2.jumlahjam = 45;

        mk2.tampilkanInformasi();
        mk2.kurangiJam(10);
        mk2.tampilkanInformasi();   
    }
}
