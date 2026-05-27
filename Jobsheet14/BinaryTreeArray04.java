public class BinaryTreeArray04 {
    Mahasiswa04[] datamahasiswa;
    int idxLast;

    public BinaryTreeArray04() {
        this.datamahasiswa = new Mahasiswa04[10];
    }

    void populasiDAta (Mahasiswa04 dataMhs[], int idxLast) {
        this.datamahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (datamahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); // Kiri
                datamahasiswa[idxStart].tampilkanInfo(); // Akar
                traverseInOrder(2 * idxStart + 2); // Kanan
            }
        }
    }
    void add(Mahasiswa04 dataMhs) {
        if (idxLast < datamahasiswa.length - 1) {
            idxLast++;
            datamahasiswa[idxLast] = dataMhs;
        } else {
            System.out.println("Array penuh");
        }
    }
    void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (datamahasiswa[idxStart] != null) {
            datamahasiswa[idxStart].tampilkanInfo();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
}