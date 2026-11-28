import java.util.Scanner;

public class Quiz2 {
    private int nim;
    private String nama;
    private double nilaitugas;
    private double nilaiUts;
    private double nilaiUas;

    public Quiz2(int nim, String nama, double nilaitugas,
                 double nilaiUts, double nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaitugas = nilaitugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    public int getnim() {
        return nim;
    }

    public String getnama() {
        return nama;
    }

    public double setNilaiTugas(double nilaitugas) {
        this.nilaitugas = nilaitugas;
        return nilaitugas;
    }

    public double setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
        return nilaiUts;
    }

    public double setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
        return nilaiUas;
    }

    public double hitungnilaiakhir() {
        return (0.3 * nilaitugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
    }

    public String tampilkanstatus() {
        double nilaiakhir = hitungnilaiakhir();
        if (nilaiakhir >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public void tampilkandataNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tugas: " + nilaitugas);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Akhir: " + hitungnilaiakhir());
        System.out.println("Status: " + tampilkanstatus());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nim");
        int nim = input.nextInt();

        System.out.print("Masukkan nama");
        String nama = input.next();

        System.out.print("Masukkan Nilai tugas ");
        double Nilaitugas = input.nextDouble();

        System.out.print("Masukkan Nilai Uas");
        double NilaiUas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS");
        double NilaiUts = input.nextDouble();

        Quiz2 mahasiswa1 = new Quiz2(
                nim, nama, Nilaitugas, NilaiUts, NilaiUas);
        mahasiswa1.tampilkandataNilai();
    }
}
