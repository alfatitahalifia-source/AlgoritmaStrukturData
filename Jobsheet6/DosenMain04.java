package Jobsheet6;
import java.util.Scanner;
public class DosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();
        DataDosen04 dataDosen = new DataDosen04();
        for (int i = 0; i < n; i++) {   
            System.out.println("Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            Boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();
            Dosen04 dosen = new Dosen04(kode, nama, jenisKelamin, usia);
            dataDosen.tambah(dosen);
        }
        System.out.println("\nData Dosen sebelum diurutkan:");
        dataDosen.tampil();
        System.out.println("\nData Dosen setelah diurutkan dengan Bubble Sort:");
        dataDosen.bubbleSort();
        dataDosen.tampil();
        System.out.println("\nData Dosen setelah diurutkan dengan Selection Sort:");
        dataDosen.selectionSort();
        dataDosen.tampil();
        System.out.println("\nData Dosen setelah diurutkan dengan Insertion Sort:");
        dataDosen.insertionSort();
        dataDosen.tampil();
        sc.close();
    }
}
