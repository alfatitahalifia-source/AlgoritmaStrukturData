public class Buku04 {
    // Menyimpan Data Buku
    String kodeBuku;
    String judul;
    String penulis;
    int tahunTerbit;

    // Mengisi Data Buku
    public Buku04(String kodeBuku, String judul, String penulis, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Menampilkan Data Buku
    public void tampilkanInfo() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
}
