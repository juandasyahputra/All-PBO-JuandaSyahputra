class Mahasiswa {
    String nama;
    int umur;

    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

public class C_ReferenceVariables {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Juanda", 20);
        tampilkanMahasiswa(mhs);
    }

    static void tampilkanMahasiswa(Mahasiswa data) {
        System.out.println("Nama: " + data.nama);
        System.out.println("Umur: " + data.umur);
    }
}
