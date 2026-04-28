public class Mahasiwa04 {
    String nim, nama, prodi, kelas;
    Mahasiwa04(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkandata(){
        System.out.println(nim + " " + nama + " " + prodi + " " + kelas);
    }
}
