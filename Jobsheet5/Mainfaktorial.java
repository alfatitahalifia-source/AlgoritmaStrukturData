package Jobsheet5;

import java.util.Scanner;

public class Mainfaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai = sc.nextInt();

        Faktorial fkFaktorial = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fkFaktorial.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fkFaktorial.faktorialDC(nilai));
    }
}
