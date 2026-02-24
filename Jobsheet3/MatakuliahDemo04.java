package Jobsheet3;
import java.util.Scanner;
public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah04[] arrayOfMatakuliah04s = new Matakuliah04[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Masukkan Kode: ");
            kode = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Masukkan Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println();
            arrayOfMatakuliah04s[i] = new Matakuliah04(kode, nama, sks, dummy);
        }
        for (int i = 0; i < 3; i++) {
                System.out.println("Data Mata Kuliah ke-" + (i + 1));
                System.out.println("Kode: " + arrayOfMatakuliah04s[i].kode);
                System.out.println("Nama: " + arrayOfMatakuliah04s[i].nama);
                System.out.println("SKS: " + arrayOfMatakuliah04s[i].sks);
                System.out.println("Jumlah Jam: " + arrayOfMatakuliah04s[i].jumlahJam);
                System.out.println();
            }
    }
}
