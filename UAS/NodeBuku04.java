public class NodeBuku04 {
    // Node untuk Menyimpan Data Buku dalam Binary Search Tree
    Buku04 data;
    // Menyimpan dari Anak Kiri dan Anak Kanan
    NodeBuku04 left;
    // Menyimpan dari Anak Kiri dan Anak Kanan
    NodeBuku04 right;

    // Mengisi Data Buku dan Inisialisasi Anak Kiri dan Anak Kanan
    public NodeBuku04(Buku04 data) {
        this.data = data;
        left = null;
        right = null;
    }
}
