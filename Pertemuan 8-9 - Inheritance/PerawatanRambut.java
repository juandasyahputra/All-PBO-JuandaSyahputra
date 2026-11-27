public class PerawatanRambut extends LayananBarber {

    public PerawatanRambut(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public String getKategori() {
        return "Perawatan Rambut";
    }
}
