package Jobsheet1;
import java.util.Scanner;
public class pratikumpemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = sc.nextInt();
        System.out.print("=================================");
        System.out.println("");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100 ) {   
        System.out.print("nilai tidak valid");
        System.out.print("==============================");
        }else;
        
        double nilaiakhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        System.out.println("Nilai Akhir : " + nilaiakhir);

        String nilaiHuruf = null;
        if (nilaiakhir >= 80 && nilaiakhir <= 100) {
            nilaiHuruf = "A";
        }else if (nilaiakhir >= 73 && nilaiakhir <= 80) {
            nilaiHuruf = "B+";
        }else if (nilaiakhir >= 65 && nilaiakhir <= 73){
            nilaiHuruf = "B";
        }else if (nilaiakhir >= 60 && nilaiakhir <= 65){
            nilaiHuruf = "C+"; 
        }else if (nilaiakhir >= 50 && nilaiakhir <= 60){
            nilaiHuruf = "C";
        }else if (nilaiakhir >= 39 && nilaiakhir <= 50 ){
            nilaiHuruf = "D";
        }else if (nilaiakhir >= 39 && nilaiakhir <= 0 ){
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        String keterangan = null;
        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "C" || nilaiHuruf == "C+" || nilaiHuruf == "C") {
            keterangan = "Selamat Anda Lulus";
        }else {
            keterangan = "Tidak Lulus";
        }
        System.out.println(keterangan);
    }
}
