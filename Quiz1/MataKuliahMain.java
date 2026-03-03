package Quiz1;

import java.util.Scanner;

public class MataKuliahMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MataKuliah mk = new MataKuliah();
        System.out.print("Masukkan kode MK: ");
        mk.kodeMK = scanner.nextLine();
        System.out.print("Masukkan nama MK: ");
        mk.namaMK = scanner.nextLine();
        System.out.print("Masukkan SKS: ");
        mk.sks = scanner.nextInt();
        System.out.println("\nInformasi Mata Kuliah:");
        mk.tampilkanInfo();

        System.out.print("\nMasukkan nama MK baru: ");
        scanner.nextLine(); 
        mk.ubahNamaMK(scanner.nextLine());
        System.out.print("Masukkan SKS baru: ");
        mk.ubahSKS(scanner.nextInt());  

        System.out.println("\nInformasi Mata Kuliah setelah perubahan:");
        mk.tampilkanInfo();
    }
}
