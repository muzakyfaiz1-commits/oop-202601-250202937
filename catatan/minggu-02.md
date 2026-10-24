# Catatan Minggu 2: Class, Object, Encapsulation



## Yang saya kerjakan
Saya melengkapi class `Aset` di folder `model` untuk menerapkan encapsulation. semua field di buat private kode, nama, status, dan kondisi. Konstruktor menerima nama dan kode, memvalidasinya, lalu mengisi sattus awal tersedia dan kondisi awal baik. Saya menambahkan getter untuk semua field dan setter untuk nama, status, dan kondisi. Kode sengaja tidak punya setter dan fieldnya final, sehingga tidak bisa di ubah setelah objek dibuat.

## Keputusan desain
- Kode dan nama divalidasi dengan satu method bantu `validasiTeks`, supaya aturan "tidak boleh null atau kosong" cukup ditulis sekali dan dipakai di konstruktor maupun `setNama`.
- Kode dan nama di-trim, sedangkan huruf besar-kecil tidak diubah. Alasannya, spasi di awal atau akhir hampir pasti salah ketik, sedangkan mengubah huruf besar-kecil bisa mengubah makna data yang diberikan pengguna. Keputusan ini saya catat di `docs/asumsi.md`.
- `setStatus` dan `setKondisi` menolak null dengan `IllegalArgumentException`, agar objek tidak pernah berada dalam keadaan tidak valid.
- Method untuk minggu 3, 4, dan 5 (`getJenis`, `hitungDenda`, `bisaDipinjam`) sengaja tidak saya ubah karena belum waktunya.



## Kendala
- Tes minggu 2 awalnya gagal semua dengan pesan `UnsupportedOperationException: TODO minggu 2: konstruktor Aset`. Penyebabnya konstruktor masih berisi bawaan template. Setelah saya mengisinya, pesan itu hilang.
-  `minggu-aktif.txt` masih bernilai 1, sehingga `uji.ps1` hanya menjalankan tes minggu 1. Saya menjalankan tes minggu 2 langsung dengan `mvn test -Dtest=Minggu02AsetTest -pl core`.


## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: penjelasan tugas minggu 2, kerangka kode class `Aset` (field, konstruktor, getter/setter, validasi), cara mengambil pembaruan minggu 2 dari repo dosen, dan membaca pesan error tes.

- Prompt utama: 
  - saya ingin melanjutkan tugas minggu kedua. tolong jelaskan apa saja tugas minggu kedua.
  
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saran dari AI tidak ada yang saya tolak.
- Satu hal yang saya pahami lebih baik sekarang: field dibuat private supaya nilainya hanya bisa berubah lewat method yang memvalidasi. Dengan begitu objek Aset tidak pernah punya kode kosong atau status null.
