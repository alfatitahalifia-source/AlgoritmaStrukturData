public class nodeantrian {
    int nomorAntrian;
    pembeli pembeli;
    nodeantrian prev, next;

    nodeantrian(int nomorAntrian, pembeli pembeli) {
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.prev = null;
        this.next = null;
    }
}
class nodepesanan {
    int nomorPesanan;
    pesanan pesanan;
    nodepesanan prev, next;

    nodepesanan(int nomorPesanan, pesanan pesanan) {
        this.nomorPesanan = nomorPesanan;
        this.pesanan = pesanan;
        this.prev = null;
        this.next = null;
    }
}
