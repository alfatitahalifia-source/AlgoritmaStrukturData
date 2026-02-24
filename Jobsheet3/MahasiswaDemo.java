package Jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] arrayOfMahasiswa04s = new Mahasiswa04[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa04s[i] = new Mahasiswa04();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM: ");
            arrayOfMahasiswa04s[i].nim = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            arrayOfMahasiswa04s[i].nama = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            arrayOfMahasiswa04s[i].kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa04s[i].ipk = Float.parseFloat(dummy);
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
                System.out.println("Data Mahasiswa ke-" + (i + 1));
                System.out.println("NIM: " + arrayOfMahasiswa04s[i].nim);
                System.out.println("Nama: " + arrayOfMahasiswa04s[i].nama);
                System.out.println("Kelas: " + arrayOfMahasiswa04s[i].kelas);
                System.out.println("IPK: " + arrayOfMahasiswa04s[i].ipk);
                System.out.println();
            }
    }
}
