public class PotongRambut extends LayananBarber {

    public PotongRambut(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public String getKategori() {
        return "Potong Rambut";
    }
}
