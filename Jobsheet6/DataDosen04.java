package Jobsheet6;

public class DataDosen04 {
    Dosen04[] dataDosen = new Dosen04[10];
    int idx;

    void tambah(Dosen04 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (Dosen04 d : dataDosen) {
            d.tampilInformasi();
            System.out.println("-------------------");
        }
    }
    void bubbleSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 0; j < dataDosen.length - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen04 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia < dataDosen[minIdx].usia) {
                    minIdx = j;
                }
            }
            Dosen04 temp = dataDosen[minIdx];
            dataDosen[minIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen04 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
}

