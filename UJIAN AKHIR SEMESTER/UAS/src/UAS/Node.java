/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package UAS;

public class Node<T> {

    T penerbit, kode, stok, rusak;
    String judul;
    Node<T> next;
    Node<T> prev;

    public Node(Node<T> prev, T kode, String judul, T penerbit, T stok, T rusak, Node<T> next) {
        this.prev = prev;
        this.kode = kode;
        this.judul = judul;
        this.penerbit = penerbit;
        this.stok = stok;
        this.rusak = rusak;
        this.next = next;
    }
}
