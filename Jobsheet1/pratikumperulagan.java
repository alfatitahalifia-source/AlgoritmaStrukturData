package Jobsheet1;

import java.util.Scanner;

public class pratikumperulagan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        char d1= nim.charAt(nim.length() - 2);
        char d2 = nim.charAt(nim.length() - 1);
        int n = (d1 - '0') * 10 + (d2 - '0');

        if (n < 10) {
            n += 10;
        }
        System.out.print("Output : ");
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            }else if (i % 2 == 0) {
                System.out.print(i + "");
            }else{
                System.out.print("*");
            }
        }
    }
}
