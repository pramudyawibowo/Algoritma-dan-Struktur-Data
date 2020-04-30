/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas3;

public class Mahasiswa<T> {

    T nama, nilai;
    Mahasiswa<T> next, prev;

    public Mahasiswa(Mahasiswa<T> prev, T nama, T nilai, Mahasiswa<T> next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
