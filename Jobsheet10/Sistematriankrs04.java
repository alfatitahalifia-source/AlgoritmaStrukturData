import java.util.Scanner;

public class Sistematriankrs04 {

    public static void tampilkanMenu() {
        System.out.println("\n============================================");
        System.out.println("   SISTEM ANTRIAN PERSETUJUAN KRS - DPA    ");
        System.out.println("============================================");
        System.out.println("1.  Tambah Mahasiswa ke Antrian");
        System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mhs)");
        System.out.println("3.  Tampilkan Semua Antrian");
        System.out.println("4.  Tampilkan 2 Antrian Terdepan");
        System.out.println("5.  Tampilkan Antrian Paling Akhir");
        System.out.println("6.  Jumlah Mahasiswa dalam Antrian");
        System.out.println("7.  Jumlah yang Sudah Proses KRS");
        System.out.println("8.  Jumlah yang Belum Proses KRS");
        System.out.println("9.  Kosongkan Antrian");
        System.out.println("0.  Keluar");
        System.out.println("--------------------------------------------");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // kapasitas antrian = 10, batas per DPA = 30
        AntrianKRS04 antrian = new AntrianKRS04(10, 30);
        int pilihan;

        System.out.println("============================================");
        System.out.println("   ANTRIAN PERSETUJUAN KRS OLEH DPA        ");
        System.out.println("   Kapasitas Antrian : 10 mahasiswa         ");
        System.out.println("   Batas per DPA     : 30 mahasiswa         ");
        System.out.println("============================================");

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("--- Pendaftaran Antrian KRS ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiwa04 mhs = new Mahasiwa04(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakSudahKRS();
                    break;
                case 8:
                    antrian.cetakBelumKRS();
                    break;
                case 9:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 0-9.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}