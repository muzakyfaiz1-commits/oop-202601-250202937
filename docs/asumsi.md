# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

## Minggu 2: normalisasi kode dan nama aset
Kode dan nama aset di-trim (spasi di awal dan akhir dibuang). Huruf besar-kecil tidak diubah.
Alasan: spasi di tepi hampir pasti salah ketik, sedangkan mengubah huruf besar-kecil bisa mengubah data asli dari pengguna.

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## Minggu 3: pembagian field antara induk dan subclass
Kode, nama, status, dan kondisi tetap di `Aset` karena dimiliki semua jenis aset.
Kapasitas (Ruang), spesifikasi dan nomor inventaris (Laptop), serta laboratorium dan tingkat risiko (AlatLab) ditaruh di subclass karena hanya relevan untuk satu jenis aset.

## Minggu 3: normalisasi teks di subclass
Spesifikasi, nomor inventaris, dan laboratorium di-trim (spasi di awal dan akhir dibuang), konsisten dengan keputusan minggu 2. Huruf besar-kecil tidak diubah.

## A-08: rumus denda progresif
- Pertanyaan: bagaimana denda dihitung bila makin lama terlambat?
- Keputusan: 7 hari pertama sama dengan flat; setelah itu tiap hari kena tambahan 50% tarif flat.
- Alasan: saya ingin memberi keringanan di minggu pertama tapi menekan keterlambatan lama
- Dampak ke kode: DendaProgresif.hitung
- Tes yang membuktikan: Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal