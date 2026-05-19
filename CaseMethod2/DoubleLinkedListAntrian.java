public class DoubleLinkedListAntrian {
    nodeantrian head, tail;
    int nomorAntrian = 1;

    boolean isEmpty() {
        return head == null;
    }
    //Double Linked List, Insert Tail, Constructor Object
    // Method ini digunakan untuk menambahkan pembeli ke antrean paling belakang
    // Nomor antrean dibuat otomatis menggunakan increment nomorAntrian++
    void tambahAntrian(pembeli pembeli) { 
        // Membuat node baru berisi data pembeli
        nodeantrian baru = new nodeantrian(nomorAntrian++, pembeli);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        System.out.println("Antrian " + baru.nomorAntrian + " ditambahkan untuk pembeli " + pembeli.namaPembeli);
    }
    // Traversal Double Linked List
    // Method ini digunakan untuk menampilkan seluruh data antrean pembeli
    // Traversal dilakukan dari head menuju tail menggunakan next
    void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        // Node sementara dimulai dari head
        nodeantrian tmp = head;
        System.out.println("================================");
        System.out.println("Daftar Antrian Pembeli:");
        System.out.println("================================");
        System.out.println("Nomor Antrian |\t Nama Pembeli |\t No Telepon |\t Waktu");
        // Traversal node satu per satu sampai null
        while (tmp != null) {
            System.out.println(tmp.nomorAntrian + " \t\t " + tmp.pembeli.namaPembeli + " \t\t " + tmp.pembeli.noTelepon + "\t\t" + tmp.pembeli.daftarWaktu);
            tmp = tmp.next;
        }
    }
    // Sequential Search, Delete Node pada Double Linked List
    // Method ini digunakan untuk mencari dan menghapus antrean
    // berdasarkan nomor antrean yang dipilih user
    nodeantrian hapusAntrian(int nomor) {
    if (head == null) {
        System.out.println("Antrian kosong");
        return null;
    }
    // Node current digunakan untuk traversal/searching
    nodeantrian current = head;
    // Sequential Search dilakukan dari head ke tail
    while (current != null) {
        // Jika nomor antrean ditemukan
        if (current.nomorAntrian == nomor) {
            // Jika hanya ada 1 node
            if (current == head && current == tail) {
                head = tail = null;
            }
            // Jika node yang dihapus adalah head
            else if (current == head) {
                head = head.next;
                head.prev = null;
            }
            // Jika node yang dihapus adalah tail
            else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            }
             // Jika node berada di tengah
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            return current;
        }
        current = current.next;
    }
    System.out.println("Nomor antrian tidak ditemukan");
    return null;
}
}
