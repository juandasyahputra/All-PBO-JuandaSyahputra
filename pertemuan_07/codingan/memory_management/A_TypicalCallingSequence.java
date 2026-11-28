public class A_TypicalCallingSequence {
    public static void main(String[] args) {
        System.out.println("Program dimulai");

        tampilkanData();
        hitungNilai();

        System.out.println("Program selesai");
    }

    static void tampilkanData() {
        System.out.println("Nama: Juanda");
        System.out.println("NIM: 20250801067");
    }

    static void hitungNilai() {
        int tugas = 80;
        int uts = 85;
        int uas = 90;

        int rataRata = (tugas + uts + uas) / 3;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
