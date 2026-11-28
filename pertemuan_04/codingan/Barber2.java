import java.util.Scanner;

public class Barber2 {

    static void tampilkanMenu() {
        System.out.println("===== BARBERSHOP =====");
        System.out.println("1. Daftar Layanan");
        System.out.println("2. Pesan Layanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    }

    static void tampilkanLayanan(String nama, int harga, boolean tersedia) {
        System.out.println("\nLayanan: " + nama);
        System.out.println("Harga: Rp" + harga + "/orang");

        if (tersedia) {
            System.out.println("Status: Tersedia");
        } else {
            System.out.println("Status: Tidak tersedia");
        }
    }

    static int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    static void tampilkanTransaksi(String layanan, int harga, int jumlah) {
        int total = hitungTotal(harga, jumlah);

        System.out.println("\n===== DETAIL PEMESANAN =====");
        System.out.println("Layanan      : " + layanan);
        System.out.println("Harga/orang  : Rp" + harga);
        System.out.println("Jumlah orang : " + jumlah);
        System.out.println("Total bayar  : Rp" + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tipe data dan variabel
        String layanan1 = "Cut Standar";
        int harga1 = 35000;
        boolean tersedia1 = true;

        String layanan2 = "Cut Premium";
        int harga2 = 50000;
        boolean tersedia2 = true;

        tampilkanMenu();
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\n===== DAFTAR LAYANAN =====");
                tampilkanLayanan(layanan1, harga1, tersedia1);
                System.out.println("--------------------------");
                tampilkanLayanan(layanan2, harga2, tersedia2);
                break;

            case 2:
                System.out.println("\n===== PESAN LAYANAN =====");
                System.out.println("1. " + layanan1);
                System.out.println("2. " + layanan2);
                System.out.print("Pilih layanan: ");
                int pilihan = input.nextInt();

                String layanan;
                int harga;
                boolean tersedia;

                if (pilihan == 1) {
                    layanan = layanan1;
                    harga = harga1;
                    tersedia = tersedia1;
                } else if (pilihan == 2) {
                    layanan = layanan2;
                    harga = harga2;
                    tersedia = tersedia2;
                } else {
                    System.out.println("Pilihan layanan tidak valid.");
                    break;
                }

                if (tersedia) {
                    System.out.print("Jumlah orang: ");
                    int jumlah = input.nextInt();

                    if (jumlah > 0) {
                        tampilkanTransaksi(layanan, harga, jumlah);
                    } else {
                        System.out.println("Jumlah orang harus lebih dari 0.");
                    }
                } else {
                    System.out.println("Layanan tidak tersedia.");
                }
                break;

            case 3:
                System.out.println("Program selesai.");
                break;

            default:
                System.out.println("Pilihan menu tidak valid.");
        }

        input.close();
    }
}
