public class Pelanggan {
    private String nama;
    private String nomorHp;

    public Pelanggan(String nama, String nomorHp) {
        this.nama = nama;
        this.nomorHp = nomorHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }
}
