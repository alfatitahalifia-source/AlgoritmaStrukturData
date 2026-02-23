package Jobsheet1;
public class pratikumfungsi {
    static int[][] stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    static int hargaAglonema = 75000;
    static int hargaKeladi   = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar    = 10000;
    public static void main(String[] args) {
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(i);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println("--------------------------------");
        }
    }

    static int hitungPendapatan(int cabang) {
        int total = 0;
        total += stok[cabang][0] * hargaAglonema;
        total += stok[cabang][1] * hargaKeladi;
        total += stok[cabang][2] * hargaAlocasia;
        total += stok[cabang][3] * hargaMawar;
        return total;
    }

    static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}