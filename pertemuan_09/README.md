# Pertemuan 9 — Hierarchical Inheritance — Barbershop

**Mata kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Nama:** Juanda Syahputra  
**NIM:** 20250801067

## Materi Pembelajaran

- Hierarchical Inheritance
- `extends`, `super()`, dan `@Override`
- Polymorphism dan encapsulation

## Penerapan pada Praktikum

Pada project Barbershop, `LayananBarber` menjadi superclass dan `PotongRambut` serta `PerawatanRambut` menjadi subclass. `Pelanggan` menyimpan data pelanggan, sedangkan `Barbershop` mengelola pemesanan. Ada diskon **10% jika subtotal minimal Rp100.000**.

## Tujuan Pembelajaran

Menerapkan satu class induk dengan dua class turunan dalam project Java.

## Laporan Praktikum

📄 [Buka laporan Pertemuan 9 (PDF)](./laprak/Laporan%20pertemuan%209%20-%2020250801067%20-%20Juanda%20Syahputra.pdf)

## Source Code

Kelima file Java tersedia dalam folder [codingan/Barbershop](./codingan/Barbershop/): `LayananBarber.java`, `PotongRambut.java`, `PerawatanRambut.java`, `Pelanggan.java`, dan `Barbershop.java`.

Untuk menjalankan dari folder project:

```bash
javac *.java
java Barbershop
```

## Materi Kuliah

Folder [materi](./materi/) disiapkan untuk slide atau modul yang akan ditambahkan.
