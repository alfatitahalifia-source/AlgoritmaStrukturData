public class BinarySearchTreeBuku04 {
    // Binary Search Tree untuk Menyimpan Data Buku
    NodeBuku04 root;

    // Inisialisasi Root
    public boolean isEmpty() {
        return root == null;
    }

    // Menambahkan Data Buku ke dalam Binary Search Tree
    public void add(Buku04 data) {
        NodeBuku04 newNode = new NodeBuku04(data);
        if (isEmpty()) {
            root = newNode;
        } else {
        NodeBuku04 current = root;
            while (true) {
                if (data.kodeBuku.compareTo(current.data.kodeBuku) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }

    // Mencari Buku berdasarkan Kode Buku
    public boolean find(String kodeBuku) {
        NodeBuku04 current = root;
        while (current != null) {
            int hasil = kodeBuku.compareTo(current.data.kodeBuku);
            if (hasil == 0) {
                return true;
            } else if (hasil < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    // Traversal In-Order untuk Menampilkan Data Buku secara Terurut
    public void traveseInOrder(NodeBuku04 node) {
        if (node != null) {
            traveseInOrder(node.left);
            node.data.tampilkanInfo();
            traveseInOrder(node.right);
        }
    }

    // Traversal Pre-Order untuk Menampilkan Data Buku secara Urut Penambahanan
    public void traversePreOrder(NodeBuku04 node) {
        if (node != null) {
            node.data.tampilkanInfo();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Menghitung Jumlah Buku dalam Binary Search Tree
    public int hitungJumlahBuku(NodeBuku04 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahBuku(node.left) + hitungJumlahBuku(node.right);
    }

    // Mencari Buku Tertua dengan rekrusif berdasarkan Tahun Terbit
    public Buku04 cariBukuTertua(NodeBuku04 node) {
        if (node == null) {
            return null;
        }
        Buku04 bukuTertua = node.data;
        Buku04 bukuKiri = cariBukuTertua(node.left);
        Buku04 bukuKanan = cariBukuTertua(node.right);
        if (bukuKiri != null && bukuKiri.tahunTerbit < bukuTertua.tahunTerbit) {
            bukuTertua = bukuKiri;
        }
        if (bukuKanan != null && bukuKanan.tahunTerbit < bukuTertua.tahunTerbit) {
            bukuTertua = bukuKanan;
        }
        return bukuTertua;
    }
}
