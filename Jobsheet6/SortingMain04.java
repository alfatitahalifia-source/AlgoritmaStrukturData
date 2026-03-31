package Jobsheet6;

public class SortingMain04 {
    public static void main(String[] args) {
        int c[] = {40, 10, 4, 9, 3};
        Sorting04 dataurut3 = new Sorting04(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        System.out.println("Data setelah diurutkan dengan bubble sort (Ascending):");
        dataurut3.tampil();
    }
}
