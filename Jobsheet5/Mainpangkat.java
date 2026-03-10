package Jobsheet5;

import java.util.Scanner;

public class Mainpangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }
        System.out.println("\nHasil Pangkat Brute Force:");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+ " = " + p.PangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("\nHasil Pangkat Divide dan Conquer:");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat + " = " + p.PangkatDC(p.nilai, p.pangkat));
        }
    }
}
