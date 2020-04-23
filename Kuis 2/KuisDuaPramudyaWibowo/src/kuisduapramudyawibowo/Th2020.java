/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package kuisduapramudyawibowo;

public class Th2020<T> {

    T data;
    Th2020<T> next;

    public Th2020(T data, Th2020<T> next) {
        this.data = data;
        this.next = next;
    }
}
