import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: ");
        double pembelian = input.nextDouble();

        // Memeriksa nominal pembelian
        if (pembelian < 0) {
            System.out.println("Total pembelian tidak boleh negatif.");
        } else {
            double diskon;

            // Menentukan diskon berdasarkan total pembelian
            if (pembelian >= 100000) {
                diskon = pembelian * 0.10;
            } else {
                diskon = 0;
            }

            double totalBayar = pembelian - diskon;

            System.out.println("Total pembelian: Rp" + pembelian);
            System.out.println("Diskon         : Rp" + diskon);
            System.out.println("Total bayar    : Rp" + totalBayar);
        }

        input.close();
    }
}
