package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList4 list = new DoubleLinkedList4();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Sisipkan Data Setelah NIM Tertentu");
            System.out.println("4. Hapus Data Awal");
            System.out.println("5. Hapus Data Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data Terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim1 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama1 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas1 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk1 = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa4 mhsAwal =
                            new Mahasiswa4(nim1, nama1, kelas1, ipk1);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    System.out.print("NIM   : ");
                    String nim2 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama2 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas2 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk2 = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa4 mhsAkhir =
                            new Mahasiswa4(nim2, nama2, kelas2, ipk2);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM tujuan : ");
                    String key = sc.nextLine();
                    System.out.print("NIM   : ");
                    String nim3 = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama3 = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas3 = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk3 = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa4 mhsBaru =
                            new Mahasiswa4(nim3, nama3, kelas3, ipk3);
                    list.insertAfter(key, mhsBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);
        sc.close();
    }
}