/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas5;

public class Node {

    int data, weight;
    Node prev;
    Node next;

    Node(Node prev, int data, int weight, Node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
