import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListAntrian antrian = new DoubleLinkedListAntrian();
        DoubleLinkedListPesanan pesananList = new DoubleLinkedListPesanan();
        int pilih;
        //Data Dummy
        pembeli p1 = new pembeli("Alfatitah", "085643210102", "08.00");
        pembeli p2 = new pembeli("Alifia", "08675342187", "09.00");
        pembeli p3 = new pembeli("Putri", "0867548397372", "23.00");
        pembeli p4 = new pembeli("Titah", "08648253648922", "12.00");
        //Menambahkan data 
        antrian.tambahAntrian(p1);
        antrian.tambahAntrian(p2);
        antrian.tambahAntrian(p3);
        antrian.tambahAntrian(p4);

        do {
            System.out.println("================================");
            System.out.println("SISTEM ANTREAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian Pembeli");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelp = sc.nextLine();
                    System.out.print("Masukkan Waktu Daftarn: ");
                    String waktuDaftar = sc.nextLine();
                    pembeli pembeliBaru = new pembeli(nama, noTelp,waktuDaftar);
                    antrian.tambahAntrian(pembeliBaru);
                    break;
                case 2:
                    antrian.tampilAntrian();
                    break;
                case 3:
                    System.out.print("Masukkan nomor antrian: ");
                    int nomor = sc.nextInt();
                    nodeantrian keluar = antrian.hapusAntrian(nomor);
                    if (keluar != null) {
                        sc.nextLine();
                        System.out.println(keluar.pembeli.namaPembeli + " menuju kasir");
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        pesanan pesanan = new pesanan(kode,namaPesanan,harga);
                        pesananList.tambahPesanan(pesanan);
                    }
                    break;
                case 4:
                    pesananList.tampilPesanan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian Royal Delish!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 0);
        sc.close();
    }
}
