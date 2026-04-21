package Jobsheet9;

public class StackSurat04 {
    Surat04[] tumpukanSurat;
    int top;
    int size;

    public StackSurat04(int size) {
        this.size = size;
        tumpukanSurat = new Surat04[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(Surat04 data) {
        if (!isFull()) {
            top++;
            tumpukanSurat[top] = data;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan data lagi.");
        }
    }
    public Surat04 pop() {
        if (!isEmpty()) {
            Surat04 data = tumpukanSurat[top];
            top--;
            return data;
        } else {
            return null;
        }
    }
    public Surat04 peek() {
        if (!isEmpty()) {
            return tumpukanSurat[top];
        } else {
            return null;
        }
    }
    public void cariSurat(String namasurat) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukanSurat[i].namaMahasiswa.equals(namasurat)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID Surat: " + tumpukanSurat[i].idSurat);
                System.out.println("Nama Mahasiswa: " + tumpukanSurat[i].namaMahasiswa);
                System.out.println("Kelas: " + tumpukanSurat[i].kelas);
                System.out.println("Jenis Izin: " + tumpukanSurat[i].jenisizin);
                System.out.println("Durasi Izin: " + tumpukanSurat[i].durasi );
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}

