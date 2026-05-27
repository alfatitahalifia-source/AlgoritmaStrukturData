public class BinaryTreeArrayMain04 {
    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();

        Mahasiswa04 mhs1 = new Mahasiswa04("244160121", "Ali", "A", 3.57);
        Mahasiswa04 mhs2 = new Mahasiswa04("244160185", "Candra", "C", 3.41);
        Mahasiswa04 mhs3 = new Mahasiswa04("244160221", "Badar", "B", 3.75);
        Mahasiswa04 mhs4 = new Mahasiswa04("2441602220", "Dewi", "B", 3.35);

        Mahasiswa04 mhs5 = new Mahasiswa04("244160131", "Devi", "A", 3.48);
        Mahasiswa04 mhs6 = new Mahasiswa04("2441606205", "Ehsan", "D", 3.61);
        Mahasiswa04 mhs7 = new Mahasiswa04("244160170", "Fizi", "B", 3.86);

        Mahasiswa04[] dataMhs = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populasiDAta(dataMhs, idxLast);
        System.out.println("\nInOrder Traversal Mahasiwa:");
        bta.traverseInOrder(0);
    }
}
