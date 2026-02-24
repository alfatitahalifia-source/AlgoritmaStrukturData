package Jobsheet3;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa04s = new Mahasiswa04[3];
        arrayOfMahasiswa04s[0] = new Mahasiswa04();
        arrayOfMahasiswa04s[0].nim = "244107060033";
        arrayOfMahasiswa04s[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa04s[0].kelas = "SIB-1E";
        arrayOfMahasiswa04s[0].ipk = 3.75f;
        
        arrayOfMahasiswa04s[1] = new Mahasiswa04();
        arrayOfMahasiswa04s[1].nim = "2341720172";
        arrayOfMahasiswa04s[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa04s[1].kelas = "TI-2A";
        arrayOfMahasiswa04s[1].ipk = 3.36f;
        
        arrayOfMahasiswa04s[2] = new Mahasiswa04();
        arrayOfMahasiswa04s[2].nim = "244107023006";
        arrayOfMahasiswa04s[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa04s[2].kelas = "TI-2A";
        arrayOfMahasiswa04s[2].ipk = 3.80f;
        
        
            
            System.out.println("NIM: " + arrayOfMahasiswa04s[0].nim);
            System.out.println("Nama: " + arrayOfMahasiswa04s[0].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa04s[0].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa04s[0].ipk);
            System.out.println();
            
            System.out.println("NIM: " + arrayOfMahasiswa04s[1].nim);
            System.out.println("Nama: " + arrayOfMahasiswa04s[1].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa04s[1].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa04s[1].ipk);
            System.out.println();
            
            System.out.println("NIM: " + arrayOfMahasiswa04s[2].nim);
            System.out.println("Nama: " + arrayOfMahasiswa04s[2].nama);
            System.out.println("Kelas: " + arrayOfMahasiswa04s[2].kelas);
            System.out.println("IPK: " + arrayOfMahasiswa04s[2].ipk);
            System.out.println();
        
    }
}
