import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 = Minggu");
        System.out.println("1 = Senin");
        System.out.println("2 = Selasa");
        System.out.println("3 = Rabu");
        System.out.println("4 = Kamis");
        System.out.println("5 = Jumat");
        System.out.println("6 = Sabtu");

        System.out.print("Masukkan kode hari: ");
        int kode = input.nextInt();

        // Menentukan nama hari menggunakan if bertingkat
        if (kode == 0) {
            System.out.println("Hari Minggu");
        } else if (kode == 1) {
            System.out.println("Hari Senin");
        } else if (kode == 2) {
            System.out.println("Hari Selasa");
        } else if (kode == 3) {
            System.out.println("Hari Rabu");
        } else if (kode == 4) {
            System.out.println("Hari Kamis");
        } else if (kode == 5) {
            System.out.println("Hari Jumat");
        } else if (kode == 6) {
            System.out.println("Hari Sabtu");
        } else {
            System.out.println("Kode tidak valid. Masukkan angka 0-6.");
        }

        input.close();
    }
}
