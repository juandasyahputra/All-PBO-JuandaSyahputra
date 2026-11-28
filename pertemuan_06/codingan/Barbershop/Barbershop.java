import java.util.Scanner;

public class Barbershop {
    static void tampilkanDaftar(
            LayananBarber layanan1, LayananBarber layanan2,
            LayananBarber layanan3, LayananBarber layanan4,
            LayananBarber layanan5) {

        System.out.println("\n===== DAFTAR LAYANAN =====");
        System.out.println("1. " + layanan1.getNama()
                + " - Rp" + layanan1.getHarga());
        System.out.println("2. " + layanan2.getNama()
                + " - Rp" + layanan2.getHarga());
        System.out.println("3. " + layanan3.getNama()
                + " - Rp" + layanan3.getHarga());
        System.out.println("4. " + layanan4.getNama()
                + " - Rp" + layanan4.getHarga());
        System.out.println("5. " + layanan5.getNama()
                + " - Rp" + layanan5.getHarga());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LayananBarber layanan1 = new LayananBarber("Cut Standar", 35000);
        LayananBarber layanan2 = new LayananBarber("Cut Premium", 50000);
        LayananBarber layanan3 = new LayananBarber("Perm", 150000);
        LayananBarber layanan4 = new LayananBarber("Coloring", 200000);
        LayananBarber layanan5 = new LayananBarber("Smoothing", 250000);

        int menu;
        do {
            System.out.println("\n===== BARBERSHOP =====");
            System.out.println("1. Daftar layanan");
            System.out.println("2. Pesan layanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    tampilkanDaftar(layanan1, layanan2, layanan3,
                            layanan4, layanan5);
                    break;

                case 2:
                    tampilkanDaftar(layanan1, layanan2, layanan3,
                            layanan4, layanan5);

                    System.out.print("Pilih layanan: ");
                    int pilihan = input.nextInt();

                    LayananBarber dipilih;
                    if (pilihan == 1) {
                        dipilih = layanan1;
                    } else if (pilihan == 2) {
                        dipilih = layanan2;
                    } else if (pilihan == 3) {
                        dipilih = layanan3;
                    } else if (pilihan == 4) {
                        dipilih = layanan4;
                    } else if (pilihan == 5) {
                        dipilih = layanan5;
                    } else {
                        System.out.println("Pilihan layanan tidak valid.");
                        break;
                    }

                    input.nextLine();
                    System.out.print("Nama pelanggan: ");
                    String nama = input.nextLine();

                    System.out.print("Nomor HP: ");
                    String nomorHp = input.nextLine();

                    Pelanggan pelanggan = new Pelanggan(nama, nomorHp);

                    System.out.print("Jumlah orang: ");
                    int jumlah = input.nextInt();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah orang harus lebih dari 0.");
                        break;
                    }

                    System.out.println("\n===== DETAIL PEMESANAN =====");
                    System.out.println("Nama        : " + pelanggan.getNama());
                    System.out.println("Nomor HP    : " + pelanggan.getNomorHp());
                    System.out.println("Layanan     : " + dipilih.getNama());
                    System.out.println("Harga/orang : Rp" + dipilih.getHarga());
                    System.out.println("Jumlah orang: " + jumlah);
                    System.out.println("Total bayar : Rp"
                            + dipilih.hitungTotal(jumlah));
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 3);

        input.close();
    }
}
