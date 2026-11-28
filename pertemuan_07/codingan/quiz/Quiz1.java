import java.util.Scanner;

public class Quiz1 {
    String judul;
    String penulis;
    int tahunterbit;

    Quiz1(String judul, String penulis, int tahunterbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunterbit = tahunterbit;
    }

    void tampilkaninfo() {
        System.out.println("\n===== daftar buku kito ====");
        System.out.println("Judul :" + judul);
        System.out.println("Penulis :" + penulis);
        System.out.println("Tahunterbit :" + tahunterbit);
    }

    public static void main(String[] args) {
        Quiz1 buku1 = new Quiz1(
                "Azab Orang Suka menyusahkan Orang lain",
                "juanda syahputra", 2024);
        buku1.tampilkaninfo();

        Quiz1 buku2 = new Quiz1(
                "hikmah dibalik berpuasa",
                "Pangga afkara dafiq", 2026);
        buku2.tampilkaninfo();
    }
}
