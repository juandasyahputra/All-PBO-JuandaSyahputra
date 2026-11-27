# Kumpulan Praktikum Pemrograman Berorientasi Objek

**Nama:** Juanda Syahputra  
**NIM:** 20250801067  
**Universitas:** Universitas Esa Unggul  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Bahasa Pemrograman:** Java

Repository ini berisi latihan dan project praktikum PBO yang disusun berdasarkan materi pertemuan.

## Daftar Materi

| Materi | Isi |
| --- | --- |
| [Pertemuan 8–9 - Inheritance](./Pertemuan%208-9%20-%20Inheritance/) | Project Barbershop dengan Hierarchical Inheritance |

Materi pertemuan lainnya akan ditambahkan berdasarkan file praktikum yang sudah dikerjakan.

## Project Barbershop

Project ini menggunakan **Hierarchical Inheritance**:

- **Parent class:** `LayananBarber`
- **Child class:** `PotongRambut` dan `PerawatanRambut`
- **Class pendukung:** `Pelanggan`
- **Program utama:** `Barbershop`

Fitur program: menampilkan daftar layanan, pemesanan, menghitung total biaya, dan diskon 10% untuk subtotal minimal Rp100.000.

### Cara Menjalankan

Buka terminal di folder `Pertemuan 8-9 - Inheritance`, lalu jalankan:

```bash
javac *.java
java Barbershop
```

Semua file Java berada dalam satu folder dan **tidak menggunakan package**.
