/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas2;

public class Perlengkapan<T> {

    T noBrg, namaBrg, berat, jumlah;
    int beratBrg;
    Perlengkapan<T> next;

    public Perlengkapan(T noBrg, T namaBrg, T berat, T jumlah, Perlengkapan<T> next) {
        this.noBrg = noBrg;
        this.namaBrg = namaBrg;
        this.berat = berat;
        this.jumlah = jumlah;
        this.beratBrg = (int) berat * (int) jumlah;
        this.next = next;
    }
}
