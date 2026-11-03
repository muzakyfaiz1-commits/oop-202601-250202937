# Catatan Minggu 4: polymorphism



## Yang saya kerjakan
saya mengoverride hitungdenda(int) di aset dan tiga subclassnya (ruang, laptop, dan alatlab). denda di hitung dari jumlah hari terlambat di kali multiplier jenis (ruang 1x, laptop 2x, alatlab 4x) di kali tarif denda dari varian nim saya, dan haru negatif di tolak dengan IllegalArgumentException. 

## Keputusan desain
- Rumus denda saya tulis sekali di method bantu di aset, lalu tiap subclass hanya mengirim multiplier jenisnya. Dengan begitu, aturan "hari negatif ditolak" tidak diulang tiga kali, dan jenis aset baru cukup menambah satu method override.

## Kendala
saya mengalami kesulitan dalam memahami overriding dan overload.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: penjelasan konsep overriding, dynamic binding, dan overloading, serta kode `hitungDenda` di `Aset`, `Ruang`, `Laptop`, `AlatLab`, dan dua method `cari` di `KatalogAset`.
- Prompt utama: 
  - bantu saya untuk memahami tugas minggu 4
  - jelaskan pada saya apa itu overriding dan overload. 
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada, semua saran dari ai saya terima.
- Satu hal yang saya pahami lebih baik sekarang: lebih memahami overriding dan overload serta cara menghitung hitungdenda di subclass.
