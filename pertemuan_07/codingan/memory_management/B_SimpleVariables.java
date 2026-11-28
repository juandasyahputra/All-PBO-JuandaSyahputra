public class B_SimpleVariables {
    public static void main(String[] args) {
        int nilai = 85;
        double ipk = 3.75;
        boolean lulus = true;

        tampilkanHasil(nilai, ipk, lulus);
    }

    static void tampilkanHasil(int nilai, double ipk, boolean lulus) {
        int tambahan = 5;
        int hasil = nilai + tambahan;

        System.out.println("Nilai: " + hasil);
        System.out.println("IPK: " + ipk);
        System.out.println("Status lulus: " + lulus);
    }
}
