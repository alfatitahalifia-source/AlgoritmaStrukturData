public class AntrianLayanan04 {
    Mahasiwa04[] data;
    int front, rear, size, max;
    public AntrianLayanan04(int max){
        this.max = max;
        this.data = new Mahasiwa04[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void tambahAntrian(Mahasiwa04 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan mahasiswa.");
            return;
        }
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " ditambahkan ke antrian.");
        }
    public Mahasiwa04 layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dapat dilayani.");
            return null;
        }
            Mahasiwa04 mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa di depan.");
        } else {
            System.out.println("Mahasiswa di depan antrian: ");
            System.out.println("NIM: " + data[front].nim + "  NAMA: " + data[front].nama + "  PRODI: " + data[front].prodi + "  KELAS: " + data[front].kelas);
        }
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dapat ditampilkan.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". " );
            data[index].tampilkandata();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
}
