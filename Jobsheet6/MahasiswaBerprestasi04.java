package Jobsheet6;

public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs;
    int idx;
    MahasiswaBerprestasi04(int n) {
        listMhs = new Mahasiswa04[n];
        idx = 0;
    }

    void tambah(Mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil() {
        for (Mahasiswa04 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j-1].ipk < listMhs[j].ipk) {
                    Mahasiswa04 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa04 tmp = listMhs[i];
            listMhs[idxMin] = listMhs[idxMin];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa04 tmp = listMhs[i];
            int j = i- 1;
            while (j >= 0 && listMhs[j].ipk < tmp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = tmp;
        }
    }
    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nama: " + listMhs[pos].nama);
            System.out.println("NIM: " + listMhs[pos].nim);
            System.out.println("IPK: " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right - left) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
            else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, mid - 1, left);
            }
            else{
            return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
}