import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan04 antrian = new AntrianLayanan04(5);
        int pilihan;
        do{
            System.out.println("=== Menu Antrian Layanan Akademik SIAKAD ===");
            System.out.println("1. Tambah Mahasiswa keAntrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa di Depan Antrian");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiwa04 mhs = new Mahasiwa04(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiwa04 mahasiswaDilayani = antrian.layaniAntrian();
                    if (mahasiswaDilayani != null) {
                        System.out.println("Mahasiswa yang dilayani: " + mahasiswaDilayani.nama);
                        mahasiswaDilayani.tampilkandata();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan akademik SIAKAD.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
