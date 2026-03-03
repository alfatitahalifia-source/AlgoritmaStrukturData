package Quiz1;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
    }
    void ubahNamaMK(String namaBaru) {
        namaMK = namaBaru;
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
}
