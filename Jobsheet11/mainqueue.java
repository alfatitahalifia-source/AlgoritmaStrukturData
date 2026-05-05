

public class mainqueue {
    public static void main(String[] args) {
        
        Queuemahasiswa q = new Queuemahasiswa();
        
        q.enqueue(new mahasiswa("001", "Dirga", "4D", 3.6));
        q.enqueue(new mahasiswa("002", "Cintia", "3C", 3.5));
        q.enqueue(new mahasiswa("003", "Bimon", "2B", 3.8));
        System.out.println("------------------------------");
        System.out.println("Antrian Mahasiswa : ");
        q.print();
        System.out.println("------------------------------");
        q.dequeue();
        System.out.println("------------------------------");
        System.out.println("Setelah Dipanggil : ");
        q.print();
        System.out.println("------------------------------");
        System.out.println("Jumlah antrian  : " + q.size());
        
    }
}
