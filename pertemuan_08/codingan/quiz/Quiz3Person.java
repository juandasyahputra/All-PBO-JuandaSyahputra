import java.util.Scanner;

class Person {
    String nama;
    int umur;

    Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

class Mahasiswa extends Person {
    String nim;

    Mahasiswa(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
    }

    void tampilkanMahasiswa() {
        tampilkanData();
        System.out.println("NIM : " + nim);
    }
}

class Dosen extends Person {
    String mataKuliah;

    Dosen(String nama, int umur, String mataKuliah) {
        super(nama, umur);
        this.mataKuliah = mataKuliah;
    }

    void tampilkanDosen() {
        tampilkanData();
        System.out.println("Mata Kuliah : " + mataKuliah);
    }
}

public class Quiz3Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT MAHASISWA ===");
        System.out.print("Masukkan nama: ");
        String namaMhs = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umurMhs = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.println("\n=== INPUT DOSEN ===");
        System.out.print("Masukkan nama dosen: ");
        String namaDosen = input.nextLine();

        System.out.print("Masukkan umur dosen: ");
        int umurDosen = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan mata kuliah: ");
        String mataKuliah = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(namaMhs, umurMhs, nim);
        Dosen dosen = new Dosen(namaDosen, umurDosen, mataKuliah);

        System.out.println("\n=== DATA MAHASISWA ===");
        mhs.tampilkanMahasiswa();

        System.out.println("\n=== DATA DOSEN ===");
        dosen.tampilkanDosen();

        input.close();
    }
}
