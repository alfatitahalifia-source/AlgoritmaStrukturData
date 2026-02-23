package Jobsheet1;
import java.util.Scanner;
public class pratikumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking & Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "K3"
        };

        int[] sks = {2, 2, 2, 2, 2, 3, 1, 2};
        double[] nilaiAngka = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        double[] nilaiSetara = new double[namaMK.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // INPUT NILAI
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai angka " + namaMK[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        }

        // KONVERSI NILAI
        for (int i = 0; i < namaMK.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        // OUTPUT TABEL
        System.out.println("\n================ HASIL KONVERSI NILAI ================");
        System.out.println("Mata Kuliah\t\tNilai\tHuruf\tBobot");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(
                namaMK[i] + "\t" +
                nilaiAngka[i] + "\t" +
                nilaiHuruf[i] + "\t" +
                nilaiSetara[i]
            );
        }

        double ip = totalBobot / totalSKS;
        System.out.println("\nIP Semester : " + ip);
    }
}

