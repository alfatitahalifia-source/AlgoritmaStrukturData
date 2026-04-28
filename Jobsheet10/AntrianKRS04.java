public class AntrianKRS04 {

    Mahasiwa04[] data;
    int front;
    int rear;
    int size;
    int max;        
    int sudahKRS;   
    int maxPerDPA;  

    public AntrianKRS04(int max, int maxPerDPA) {
        this.max       = max;
        this.maxPerDPA = maxPerDPA;
        this.data      = new Mahasiwa04[max];
        this.front     = 0;
        this.rear      = -1;
        this.size      = 0;
        this.sudahKRS  = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front    = 0;
        rear     = -1;
        size     = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
    public void tambahAntrian(Mahasiwa04 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        if (sudahKRS >= maxPerDPA) {
            System.out.println("DPA sudah mencapai batas maksimal " + maxPerDPA + " mahasiswa.");
            return;
        }
        rear         = (rear + 1) % max;
        data[rear]   = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke antrian. (Posisi ke-" + size + ")");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dipanggil.");
            return;
        }
        if (sudahKRS >= maxPerDPA) {
            System.out.println("DPA sudah mencapai batas maksimal " + maxPerDPA + " mahasiswa.");
            return;
        }

        System.out.println("=== Memanggil 2 Mahasiswa untuk Proses KRS ===");
        int jumlahPanggil = Math.min(2, size); // panggil 2, atau sisa jika < 2

        for (int i = 0; i < jumlahPanggil; i++) {
            if (sudahKRS >= maxPerDPA) {
                System.out.println("Batas DPA tercapai, panggilan dihentikan.");
                break;
            }
            Mahasiwa04 mhs = data[front];
            front    = (front + 1) % max;
            size--;
            sudahKRS++;
            System.out.print("[" + sudahKRS + "] Diproses KRS: ");
            mhs.tampilkandata();
        }
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Semua Antrian KRS ===");
        System.out.println("NO | NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + "  | ");
            data[index].tampilkandata();
        }
    }
    public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== 2 Mahasiswa Terdepan dalam Antrian ===");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkandata();
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Mahasiswa Paling Akhir dalam Antrian ===");
        System.out.print(">> ");
        data[rear].tampilkandata();
    }
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian : " + size);
    }
    public void cetakSudahKRS() {
        System.out.println("Sudah proses KRS               : " + sudahKRS + " / " + maxPerDPA + " mahasiswa");
    }
    public void cetakBelumKRS() {
        int belum = maxPerDPA - sudahKRS;
        System.out.println("Belum proses KRS (sisa kuota)  : " + belum + " mahasiswa");
    }
}
