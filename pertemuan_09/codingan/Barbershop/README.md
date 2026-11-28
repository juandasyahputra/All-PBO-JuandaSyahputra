# Pertemuan 9 — Barbershop (Hierarchical Inheritance)

Project ini adalah pengembangan program Barbershop menggunakan konsep **Hierarchical Inheritance**, yaitu satu class induk memiliki lebih dari satu class anak.

```text
          LayananBarber
           /         \
    PotongRambut   PerawatanRambut
```

## Penjelasan File

| Nama File | Fungsi |
| --- | --- |
| `LayananBarber.java` | Parent class: nama, harga, getter/setter, hitung total, dan kategori |
| `PotongRambut.java` | Child class pertama yang meng-override kategori menjadi Potong Rambut |
| `PerawatanRambut.java` | Child class kedua yang meng-override kategori menjadi Perawatan Rambut |
| `Pelanggan.java` | Menyimpan nama dan nomor HP pelanggan (encapsulation) |
| `Barbershop.java` | Program utama untuk memilih layanan, mencatat pelanggan, dan menghitung pembayaran |

## Konsep PBO

- **Inheritance:** `extends LayananBarber`
- **Constructor parent:** `super(nama, harga)`
- **Method Overriding:** `getKategori()` di kedua class anak
- **Polymorphism:** variabel `LayananBarber dipilih` dapat merujuk objek dari kedua class anak
- **Encapsulation:** atribut `private` serta getter dan setter

## Cara Menjalankan

Simpan kelima file Java di folder ini. Buka terminal di folder ini lalu ketik:

```bash
javac *.java
java Barbershop
```

Pilih menu 1 untuk melihat layanan, menu 2 untuk memesan, atau menu 3 untuk keluar.

Diskon **10%** berlaku jika subtotal pemesanan **Rp100.000 atau lebih**.
