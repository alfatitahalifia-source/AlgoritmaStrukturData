package Jobsheet5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        NilaiMahasiswa[] mahasiswa = new NilaiMahasiswa[5];
        NilaiMahasiswa nm = new NilaiMahasiswa();    
        int[] uts1 = {78,85,90,76,92,88,80,82};
        int[] uas1 = {82,88,87,79,95,85,83,84};

        int maxUTS1 = nm.maxUTS(uts1, 0, uts1.length - 1);
        int minUTS1 = nm.minUTS(uts1, 0, uts1.length - 1);
        double rataUAS1 = nm.rataUAS(uas1);

        System.out.println("Nilai UTS Mahasiswa 1: " + maxUTS1);
        System.out.println("Nilai UTS Mahasiswa 1: " + minUTS1);
        System.out.println("Rata-rata UAS Mahasiswa 1: " + rataUAS1);
    }
}
