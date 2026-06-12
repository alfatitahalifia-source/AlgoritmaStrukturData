public class BukuMain04 {
    public static void main(String[] args) {
        // Membuat Binary Search Tree untuk Menyimpan Data Buku
        BinarySearchTreeBuku04 bst = new BinarySearchTreeBuku04();

        // Menambahkan Data Buku ke dalam Binary Search Tree
        bst.add(new Buku04("BK105", "Struktur Data", "Andi", 2020));
        bst.add(new Buku04("BK102", "Algoritma Dasar", "Budi", 2019));
        bst.add(new Buku04("BK108", "Basis Data", "Citra", 2021));
        bst.add(new Buku04("BK101", "Pemrograman Java", "Dewi", 2018));
        bst.add(new Buku04("BK104", "Sistem Operasi", "Eka", 2022));
        bst.add(new Buku04("BK107", "Jaringan Komputer", "Fajar", 2017));

        // Menampilkan Data Buku secara Terurut (In-Order Traversal)
        System.out.println("=================================");
        System.out.println(" \t DATA BUKU IN-ORDER ");
        System.out.println("=================================");
        bst.traveseInOrder(bst.root);

        // Menampilkan Data Buku secara Urut Penambahan (Pre-Order Traversal)
        System.out.println("=================================");
        System.out.println(" \t DATA BUKU PRE-ORDER ");
        System.out.println("=================================");
        bst.traversePreOrder(bst.root);
        System.out.println();
        
        // Mencari Buku berdasarkan Kode Buku
        System.out.println("PENCARIAN BK104 : " 
            + (bst.find("BK104") ? "Ditemukan" : "Tidak Ditemukan"));

        // Mencari Buku berdasarkan Kode Buku yang Tidak Ada
        System.out.println("PENCARIAN BK110 : "
            + (bst.find("BK110") ? "Ditemukan" : "Tidak Ditemukan"));
            System.out.println();

        // Menampilkan Jumlah Buku dalam Binary Search Tree
        System.out.println("=================================");
        System.out.println("Jumlah Buku : " + bst.hitungJumlahBuku(bst.root));
        System.out.println("=================================");

        // Mencari Buku Tertua dengan rekrusif dalam Binary Search Tree
        Buku04 bukutertua = bst.cariBukuTertua(bst.root);
        if (bukutertua != null) {
            System.out.println("Buku Tertua : ");
            bukutertua.tampilkanInfo();
        }
    }
}
