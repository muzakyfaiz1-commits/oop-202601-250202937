# Catatan Minggu 3: Inheritance

## Yang saya kerjakan
Saya membuat tiga class turunan dari Aset, yaitu Ruang, Laptop, dan AlatLab. Tiap class punya field khas yang private dan final: kapasitas untuk ruang, spesifikasi dan nomor inventaris untuk laptop, serta laboratorium dan tingkat risiko untuk alat lab. Konstruktor tiap subclass memanggil `super(kode, nama)` supaya validasi dari `Aset` tetap berlaku, lalu memvalidasi field barunya sendiri. Setiap subclass juga meng-override `getJenis()` agar mengembalikan RUANG, LAPTOP, atau ALAT_LAB. Delapan tes `Minggu03HierarkiTest` lulus.


## Keputusan desain
- Kode, nama, status, dan kondisi tetap di Aset karena dimiliki semua jenis aset. Kapasitas, spesifikasi, nomor inventaris, laboratorium, dan tingkat risiko ada di subclass karena hanya relevan untuk satu jenis aset.
- Field khas subclass saya buat `private final` tanpa setter, sama seperti kode di minggu 2, supaya nilainya tidak berubah setelah objek dibuat.
- teks seperti spesifikasi, nomor inventaris dan laboratorium saya `trim()`, konsisten dengan keputusan minggu 2. keputusan ini saya catat di `docs/asumsi.md`.
- inheritance kurang tepat kalau satu aset punya sifat dari dua jenis sekaligus. contoh Ruang Laboratorium Komputer. sebagai ruang, ia punhya kapasitas seperti ruang. sebagai bagian dari laboratorium, ia punya nama laboratorium dan tingkat resiko seperti Alatlab. di java, sebuah class hanya boleh punya satu induk, jadi class ini tidak bisa extends ruang dan extends Alatlab sekaligus.  kalau memaksa memilih salah satu, saya harus menyalin field dari class yg satunya lagi, dan itu mengulang kode yg tadinya ingin di hindari. Dengan komposisi, masalahnya lebih mudah diatasi. Class Aset cukup menyimpan objek lain yang menjelaskan sifat tambahannya, misalnya objek untuk data kapasitas dan objek untuk profil laboratorium. Sifat-sifat itu bisa digabung sesuai kebutuhan tanpa dibatasi satu induk. Inheritance juga membuat semua subclass ikut terpengaruh kalau class Aset berubah, sedangkan pada komposisi hubungan antar bagian lebih longgar.


## Kendala
Tidak ada kendala berarti pada tugas minggu ini. Setelah ketiga class (`Ruang`, `Laptop`, dan `AlatLab`) saya isi, kedelapan tes `Minggu03HierarkiTest` langsung lulus pada percobaan pertama. Bagian yang paling perlu saya pahami adalah pemanggilan `super(kode, nama)` di konstruktor, supaya validasi dari `Aset` tetap berlaku di subclass.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: penjelasan konsep inheritance dan `super`, serta kode `Ruang`, `Laptop`, dan `AlatLab` (field, konstruktor dengan validasi, getter, dan `getJenis()`).

- Prompt utama: 
  - tolong jelaskan tugas dari minggu ke 3. dan apa saja yg harus saya kerjakan atau lakukan di week 3 ini
  - jelaskan apaitu inheritance
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada
- Satu hal yang saya pahami lebih baik sekarang: keterbatasan inheritance.
