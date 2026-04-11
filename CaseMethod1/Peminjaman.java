package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    void tampilPinjaman() {
        mhs.tampilInformasi();
        System.out.println("Judul Buku : " + buku.judul);
        System.out.println("Lama Pinjam : " + lamaPinjam + " hari");
        System.out.println("Terlambat : " + terlambat + " hari");
        System.out.println("Denda : Rp " + denda);
    }
}
