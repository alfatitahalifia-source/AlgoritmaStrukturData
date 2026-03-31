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
        int pilih = 0;

while (pilih != 5) {
    System.out.println("\n=== MENU ===");
    System.out.println("1. Tambah Data");
    System.out.println("2. Tampil Data");
    System.out.println("3. Sorting ASC");
    System.out.println("4. Sorting DSC");
    System.out.println("5. Keluar");
    System.out.print("Pilih: ");
    pilih = sc.nextInt();
    sc.nextLine();

    switch (pilih) {
        case 1:
            System.out.println("Masukkan data dosen baru:");
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
            break;
        case 2:
            dataDosen.tampil();
            break;
        case 3:
            dataDosen.bubbleSort();
            System.out.println("Data setelah sorting ASC:");
            dataDosen.tampil();
            break;
        case 4:
            dataDosen.selectionSort();
            System.out.println("Data setelah sorting DSC:");
            dataDosen.tampil();
            break;
        case 5:
            System.out.println("Terima kasih!");
            break;
        default:
            System.out.println("Pilihan salah!");
    }
}
    }
}
