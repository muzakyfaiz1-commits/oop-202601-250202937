# Catatan Minggu 1: Paradigma Pemrograman dan setup


## Yang saya kerjakan
Saya membuat program sapaan "Hello Aset-Pinjam" dalam tiga gaya yaitu, prosedural, OOP, dan fungsional, ketiganya menghasilkan kalimat yg sama. saya juga mengisi `mahasiswa.properties` dan menjalankan tes sampai lima tesnya lulus.

untuk kelebihan dan keterbatasan dari ketiganya yaitu:
- Prosedural: kelebihannya sederhana dan cepat di tulis. keterbatasannnya data dan aturan tersebar sehingga sulit di kembangkan kalau jenis asetnya bertambah.
- OOP: kelebihannya data aset dan aturannya bisa di bungkus dalam satu class. keterbatasannya kode lebih panjang untuk hal sederhana.
- Fungsional: kelebihannya ringkas dan mudah di kombinasikan. keterbatasannya kurang cocok menyimpan data yg berubah.

## Keputusan desain
saya memakai format kalimat yang sama di ketiga gaya, `"Hello Aset-Pinjam,saya<nama>(<nim>)"`, karena ada tes yang membandingkan ketiga hasilnya harus sama persis. Field di HelloOOP saya buat private final sup[aya datanya tidak bisa di ubah dari luar class.]

## Kendala
saya awalnya salah menjalankan `uji.ps1` dari folder `core`, padahal skripnya ada di folder utama repo. lalu muncul pesan "running scripts is disabled", yang saya atasi dengan `powershell -ExecutionPolicy Bypass -File`. dua tes juga sempat gagal karena salah ketik. saya menemukannya dengan membaca pesan "expescted / but was" di hasil tes.

## Penggunaan AI
- Alat yang dipakai: Claude
- Memperbaiki eror saat menjalankan tes. Skrip `uji.ps1` tidak di temukan karena saya menjalankannya dari folder yg salah, lalu terblokir     oleh pembatas execution policy PowerShell. AI menyarankan pindah ke folder utama repo dan menjalankan `powershell -ExecutionPolicy Bypass -File .\scripts\uji.ps1`. AI juga membantu membaca pesan kegagalan tes (expected / but was) untuk menemukan salah ketik di kode saya.
- Prompt utama:
  - ketika saya jalankan tesnya kenapa merah. saya menjalankannya di terminal vs code” (disertai screenshot error)
  - bantu saya menjelaskan tugas dari matakuliah OOP
  - jelaskan apa yg harus saya lakukan untuk mengerjakan tugas minggu 1

- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada, saya terima semua
- Satu hal yang saya pahami lebih baik sekarang: saya menjadi lebih memahami tentang java. 
