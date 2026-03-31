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
            int j = i;
            while (j >= 0 && listMhs[j-1].ipk > tmp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
}