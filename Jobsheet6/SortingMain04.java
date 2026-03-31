package Jobsheet6;

public class SortingMain04 {
    public static void main(String[] args) {
        int b[] = {30, 20, 2, 8, 14};
        Sorting04 dataurut2 = new Sorting04(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        System.out.println("Data setelah diurutkan dengan bubble sort (Ascending):");
        dataurut2.tampil();
    }
}
