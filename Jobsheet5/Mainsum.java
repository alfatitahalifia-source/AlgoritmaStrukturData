package Jobsheet5;

import java.util.Scanner;

public class Mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        sum sm = new sum(elemen);
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan elemen ke-" + (i+1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total keuntungan (Brute Force): " + sm.totalBF());
        System.out.println("Total keuntungan (Divide and Conquer): " + sm.totalDC(0, elemen - 1));
    }
}
