package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
public long hitung(Aset aset, int hariTerlambat) {
    long flat = aset.hitungDenda(hariTerlambat);          // 0 hari = 0, hari negatif ditolak oleh aset
    int hariLewat = Math.max(0, hariTerlambat - 7);
    long tambahan = aset.hitungDenda(hariLewat) / 2;
    return flat + tambahan;
}
}
