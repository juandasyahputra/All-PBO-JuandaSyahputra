public class LayananBarber {
    private String nama;
    private int harga;

    public LayananBarber(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public long hitungTotal(int jumlah) {
        return (long) harga * jumlah;
    }
}
