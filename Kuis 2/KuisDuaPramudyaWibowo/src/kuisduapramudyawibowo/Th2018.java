/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package kuisduapramudyawibowo;

public class Th2018<T> {

    T data;
    Th2018<T> next;

    public Th2018(T data, Th2018<T> next) {
        this.data = data;
        this.next = next;
    }
}
