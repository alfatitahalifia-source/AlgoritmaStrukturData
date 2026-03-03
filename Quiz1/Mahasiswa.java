package Quiz1;

public class Mahasiswa {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah[] mataKuliahDiambil;

    void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        for (MataKuliah mk : mataKuliahDiambil) {
            if (mk != null) {
                System.out.println("- " + mk.namaMK);
            }
        }
    }
    void tambahMataKuliah(MataKuliah mk) {
        for (int i = 0; i < mataKuliahDiambil.length; i++) {
            if (mataKuliahDiambil[i] == null) {
                mataKuliahDiambil[i] = mk;
                break;
            }
        }
    }
    void hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : mataKuliahDiambil) {
            if (mk != null) {
                totalSKS += mk.sks;
            }
        }
        System.out.println("Total SKS yang Diambil: " + totalSKS);
    }
}
