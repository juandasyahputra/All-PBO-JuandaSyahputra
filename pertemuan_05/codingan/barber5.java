import java.util.Scanner;

public class barber5 {
    static void tampilkanMenu() {
        System.out.println("===Barbershop===");
        System.out.println("1. daftar layanan :");
        System.out.println("2. pilih layanan  :");
        System.out.println("3. Keluar         :");
        System.out.print("pilih menu :");
    }

    static void tampilkanlayanan(String nama, int harga) {
        System.out.println("1. Layanan :" + nama);
        System.out.println("2.harga/orang = rp " + harga);
    }

    static int hitungtotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    static void tampilkantransaksi(String layanan, int harga, int jumlah) {
        int total = hitungtotal(harga, jumlah);
        System.out.println("1.detail pesanan");
        System.out.println("2.layanan " + layanan);
        System.out.println("3.harga/orang = RP " + harga);
        System.out.println("Jumlah orang " + jumlah);
        System.out.println("total bayar = Rp " + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String layanan1 = "Cut standar";
        int harga1 = 35000;

        String layanan2 = "Cut premium";
        int harga2 = 50000;

        tampilkanMenu();
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Daftar layanan");
                tampilkanlayanan(layanan1, harga1);
                tampilkanlayanan(layanan2, harga2);
                break;

            case 2:
                System.out.println("Pilih layanan");
                System.out.println("1. Layanan : " + layanan1);
                System.out.println("2.layanan  : " + layanan2);
                System.out.println("Pilih menu");
                int pilih = input.nextInt();

                String layanan;
                int harga;

                if (pilih == 1) {
                    layanan = layanan1;
                    harga = harga1;
                } else if (pilih == 2) {
                    layanan = layanan2;
                    harga = harga2;
                } else {
                    System.out.println("pilihan tidak valid");
                    break;
                }

                System.out.println("Jumlah orang");
                int jumlah = input.nextInt();
                if (jumlah > 0) {
                    tampilkantransaksi(layanan, harga, jumlah);
                } else {
                    System.out.println("jumlah harus lebih besar dari nol");
                }
                break;

            case 3:
                System.out.println("Sudah selesai");
                break;
        }

        input.close();
    }
}
