package Jobsheet3;

public class DataDosen04 {
    public void dataSemuaDosen(Dosen04[] arrayOfDosen04s) {
        for (int i = 0; i < arrayOfDosen04s.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfDosen04s[i].kode);
            System.out.println("Nama: " + arrayOfDosen04s[i].nama);
            System.out.println("Jenis Kelamin: " +
            (arrayOfDosen04s[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + arrayOfDosen04s[i].usia);
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen04s) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (int i = 0; i < arrayOfDosen04s.length; i++) {
            if (arrayOfDosen04s[i].jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki: " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahPerempuan);
    }
    public void rataRataUsiaDosen(Dosen04[] arrayOfDosen04s) {
        int totalUsia = 0;

        for (int i = 0; i < arrayOfDosen04s.length; i++) {
            totalUsia += arrayOfDosen04s[i].usia;
        }

        double rataRataUsia = (double) totalUsia / arrayOfDosen04s.length;
        System.out.println("Rata-rata Usia Dosen: " + rataRataUsia);
    }
    public void infoDosenTertua(Dosen04[] arrayOfDosen04s) {
        Dosen04 dosenTertua = arrayOfDosen04s[0];

        for (int i = 1; i < arrayOfDosen04s.length; i++) {
            if (arrayOfDosen04s[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen04s[i];
            }
        }

        System.out.println("Dosen Tertua:");
        System.out.println("Kode: " + dosenTertua.kode);
        System.out.println("Nama: " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " +
        (dosenTertua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenTertua.usia);
    }
    public void infoDosenTermuda(Dosen04[] arrayOfDosen04s) {
        Dosen04 dosenTermuda = arrayOfDosen04s[0];

        for (int i = 1; i < arrayOfDosen04s.length; i++) {
            if (arrayOfDosen04s[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayOfDosen04s[i];
            }
        }

        System.out.println("Dosen Termuda:");
        System.out.println("Kode: " + dosenTermuda.kode);
        System.out.println("Nama: " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " +
        (dosenTermuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenTermuda.usia);
    }
}
