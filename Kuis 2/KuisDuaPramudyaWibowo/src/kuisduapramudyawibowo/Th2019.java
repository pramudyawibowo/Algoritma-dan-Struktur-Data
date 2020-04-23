/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package kuisduapramudyawibowo;

public class Th2019<T> {

    T data;
    Th2019<T> next;

    public Th2019(T data, Th2019<T> next) {
        this.data = data;
        this.next = next;
    }
}
