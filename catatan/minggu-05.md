# Catatan Minggu 5: Abstraction


## Yang saya kerjakan
MInggu ini saya mengubah aset menjadi class abstract dan mengisi bisadipinjam(), yg bernilai true hanya jika status TERSEDIA dan kondisi bukan RUSAK_BERAT. Method hitungDenda di aset saya jadikan abstract karena tiap jenis aset (ruang, laptop, alatlab) punya multiplier denda sendiri. saya juga mengimplementasikan interface AturanDenda di dua class: `DendaFlat` (hasilnya sama dengan `aset.hitungDenda(hari)`) dan `DendaProgresif`. semua tes minggu 1 - 5 lolos. 

## Keputusan desain
-  Aset dijadikan abstract class karena menyimpan state bersama (kode, nama, status, kondisi) dan logika bersama (validasi, `bisaDipinjam`). `DapatDipinjam` dan `AturanDenda` berupa interface karena hanya kontrak perilaku.
-  Rumus denda progresif: 7 hari pertama sama dengan flat; setelah hari ke-7, setiap hari kena tambahan 50% dari tarif flat. Rumus ini memenuhi syarat tes: 0 hari = 0, tidak pernah lebih murah dari flat, tidak turun saat hari bertambah, dan di hari ke-30 lebih mahal dari flat. Alasan lengkap ada di `docs/asumsi.md`.

## Kendala
saya mengalami sedikit kendala ketika mengimplementasikan DapatDipinjam untuk di jadikan kelas abstrak.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI:  Aset.java (bisaDipinjam, hitungDenda abstract), DendaFlat.hitung, usulan rumus DendaProgresif.hitung.
- Prompt utama: 
  -  "saya ingin melanjutkan tugas minggu 5. bantu saya mengerjakan tugas minggu 5 ini dan apa saja yg harus saya lakukan di minggu 5 ini"

- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada, semua saran ai saya terima.
- Satu hal yang saya pahami lebih baik sekarang: class abstract tidak bisa dibuat objeknya langsung, hanya subclass-nya yang bisa, tetapi variabel bertipe Aset tetap boleh menunjuk ke objek Ruang, Laptop, atau AlatLab.
