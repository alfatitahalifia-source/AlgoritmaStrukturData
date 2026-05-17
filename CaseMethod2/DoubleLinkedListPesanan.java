public class DoubleLinkedListPesanan {
    nodepesanan head, tail;

    boolean isEmpty() {
        return head == null;
    }
    // Double Linked List, Insert Tail, Constructor Object
    void tambahPesanan(pesanan pesanan) {
        nodepesanan baru = new nodepesanan(pesanan.idPesanan, pesanan);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        System.out.println("Pesanan " + baru.pesanan.namaPesanan + " dengan ID " + baru.pesanan.idPesanan + " ditambahkan.");
    }
    // Bubble Sort Manual pada Double Linked List
    // Method ini digunakan untuk mengurutkan nama pesanan
    // secara ascending (A-Z)
    // Sorting dilakukan manual tanpa Collections.sort()
    void sortingNamaPesanan() {
        if (head == null) {
            return;
        }
        boolean tukar;
        do {
            tukar = false;
             // Traversal dimulai dari head
            nodepesanan current = head;
            while (current.next != null) {
                 // Membandingkan nama pesanan sekarang dengan next
                if (current.pesanan.namaPesanan.compareTo(current.next.pesanan.namaPesanan) > 0) {
                    pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
    // Traversal Double Linked List
    // Method ini digunakan untuk menampilkan seluruh laporan pesanan
    // Data ditampilkan setelah proses sorting manual
    void tampilPesanan() {
        // Memanggil sorting Bubble Sort
        sortingNamaPesanan();
        // Node sementara dimulai dari head
        nodepesanan tmp = head;
        System.out.println("================================");
        System.out.println("Daftar Pesanan:");
        System.out.println("================================");
        System.out.println("ID Pesanan |\t Nama Pesanan |\t Harga Pesanan");
        // Traversal node satu per satu
        while (tmp != null) {
            System.out.println(tmp.pesanan.idPesanan +"\t\t" + tmp.pesanan.namaPesanan + "\t\t" + tmp.pesanan.hargaPesanan);
            tmp = tmp.next;
        }
    }
}
